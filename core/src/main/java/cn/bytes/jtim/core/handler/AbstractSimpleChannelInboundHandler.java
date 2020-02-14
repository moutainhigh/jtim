package cn.bytes.jtim.core.handler;

import cn.bytes.jtim.core.Actuator;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.Getter;

/**
 * @version 1.0
 * @date 2020/2/14 15:29
 */
@Getter
public abstract class AbstractSimpleChannelInboundHandler<I> extends SimpleChannelInboundHandler<I>
        implements DefineChannelHandler<I> {

    private Actuator actuator;

    @Override
    public void bindActuator(Actuator actuator) {

        this.actuator = actuator;
    }
}
