// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: distribute.proto

package cn.bytes.jtim.core.protocol.protobuf;

public final class Distribute {
  private Distribute() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2ODistributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2ODistributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2ODistributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2ODistributeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2MDistributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2MDistributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2MDistributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2MDistributeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020distribute.proto\"\205\001\n\024O2ODistributeRequ" +
      "est\022\r\n\005msgId\030\001 \001(\t\022\014\n\004from\030\002 \001(\t\022\020\n\010from" +
      "Name\030\003 \001(\t\022\n\n\002to\030\004 \001(\t\022\017\n\007content\030\005 \001(\t\022" +
      "\016\n\006msgKey\030\006 \001(\t\022\021\n\ttimestamp\030\007 \001(\003\"6\n\025O2" +
      "ODistributeResponse\022\r\n\005msgId\030\001 \001(\t\022\016\n\006ms" +
      "gKey\030\002 \001(\t\"\210\001\n\024O2MDistributeRequest\022\r\n\005m" +
      "sgId\030\001 \001(\t\022\014\n\004from\030\002 \001(\t\022\020\n\010fromName\030\003 \001" +
      "(\t\022\r\n\005group\030\004 \001(\t\022\017\n\007content\030\005 \001(\t\022\016\n\006ms" +
      "gKey\030\006 \001(\t\022\021\n\ttimestamp\030\007 \001(\003\"6\n\025O2MDist" +
      "ributeResponse\022\r\n\005msgId\030\001 \001(\t\022\016\n\006msgKey\030" +
      "\002 \001(\tB(\n$cn.bytes.jtim.core.protocol.pro" +
      "tobufP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_O2ODistributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_O2ODistributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2ODistributeRequest_descriptor,
        new java.lang.String[] { "MsgId", "From", "FromName", "To", "Content", "MsgKey", "Timestamp", });
    internal_static_O2ODistributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_O2ODistributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2ODistributeResponse_descriptor,
        new java.lang.String[] { "MsgId", "MsgKey", });
    internal_static_O2MDistributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_O2MDistributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2MDistributeRequest_descriptor,
        new java.lang.String[] { "MsgId", "From", "FromName", "Group", "Content", "MsgKey", "Timestamp", });
    internal_static_O2MDistributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_O2MDistributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2MDistributeResponse_descriptor,
        new java.lang.String[] { "MsgId", "MsgKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}