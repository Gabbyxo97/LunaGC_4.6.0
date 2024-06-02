// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransmitReason.proto

package emu.grasscutter.net.proto;

public final class TransmitReasonOuterClass {
  private TransmitReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Version: 4.6.0
   * Obfs: DJLNCMNEAOI
   * </pre>
   *
   * Protobuf enum {@code TransmitReason}
   */
  public enum TransmitReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TRANSMIT_NONE = 0;</code>
     */
    TRANSMIT_NONE(0),
    /**
     * <code>TRANSMIT_QUEST = 1;</code>
     */
    TRANSMIT_QUEST(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>TRANSMIT_NONE = 0;</code>
     */
    public static final int TRANSMIT_NONE_VALUE = 0;
    /**
     * <code>TRANSMIT_QUEST = 1;</code>
     */
    public static final int TRANSMIT_QUEST_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TransmitReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TransmitReason forNumber(int value) {
      switch (value) {
        case 0: return TRANSMIT_NONE;
        case 1: return TRANSMIT_QUEST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TransmitReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TransmitReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TransmitReason>() {
            public TransmitReason findValueByNumber(int number) {
              return TransmitReason.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TransmitReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final TransmitReason[] VALUES = values();

    public static TransmitReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TransmitReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:TransmitReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TransmitReason.proto*7\n\016TransmitReason" +
      "\022\021\n\rTRANSMIT_NONE\020\000\022\022\n\016TRANSMIT_QUEST\020\001B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
