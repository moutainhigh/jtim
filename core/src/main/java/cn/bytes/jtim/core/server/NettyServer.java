package cn.bytes.jtim.core.server;

import cn.bytes.jtim.core.ActuatorInitializer;
import cn.bytes.jtim.core.config.Configuration;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.FutureListener;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

@Slf4j
public abstract class NettyServer extends ActuatorInitializer {

    public NettyServer(Configuration configuration) {
        super(configuration);
    }

    @Override
    public Future<Void> openAsync() {

        ServerBootstrap b = new ServerBootstrap();

        b.group(bossGroup, workerGroup).channel(super.getNioServerSocketChannelClass()).childHandler(this);

        super.options(b);

        return b.bind(super.getSocketAddress());
    }

    @Override
    public void init() {
        // todo
        state.compareAndSet(State.Created, State.Initialized);
        super.selectEventLoopGroup();
    }

    @Override
    public void close() {
        log.info("Socket server closing");
        super.close();
        log.info("Socket server closed!!");
    }

}
