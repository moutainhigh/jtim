package cn.bytes.jtim.core.channel.module.connection;

import cn.bytes.jtim.core.module.Module;
import cn.bytes.jtim.core.protocol.protobuf.Message;
import io.netty.channel.Channel;

import java.util.Collection;

/**
 * @version 1.0
 * @date 2020/2/16 21:50
 */
public interface ConnectionModule extends Module {

    ConnectionModule saveConnection(Connection connection);

    ConnectionModule removeConnection(Connection connection);

    ConnectionModule removeConnection(Channel channel);

    int onLine();

    ConnectionModule writeAndFlush(String channelId, Message body);

    ConnectionModule writeAndFlush(Connection connection, Message body);

    ConnectionModule writeAndFlush(Message body);

    Collection<Connection> getConnections();

    @Override
    default String key() {
        return ConnectionModule.class.getSimpleName();
    }

}
