// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MGHDLMIEMLI.proto

package emu.grasscutter.net.proto;

public final class MGHDLMIEMLIOuterClass {
  private MGHDLMIEMLIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MGHDLMIEMLIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MGHDLMIEMLI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
     * @return Whether the detailAbilityInfo field is set.
     */
    boolean hasDetailAbilityInfo();
    /**
     * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
     * @return The detailAbilityInfo.
     */
    emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO getDetailAbilityInfo();
    /**
     * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
     */
    emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIOOrBuilder getDetailAbilityInfoOrBuilder();

    public emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI.ADCLBBDEGBDCase getADCLBBDEGBDCase();
  }
  /**
   * Protobuf type {@code MGHDLMIEMLI}
   */
  public static final class MGHDLMIEMLI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MGHDLMIEMLI)
      MGHDLMIEMLIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MGHDLMIEMLI.newBuilder() to construct.
    private MGHDLMIEMLI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MGHDLMIEMLI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MGHDLMIEMLI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MGHDLMIEMLI(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 74: {
              emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.Builder subBuilder = null;
              if (aDCLBBDEGBDCase_ == 9) {
                subBuilder = ((emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_).toBuilder();
              }
              aDCLBBDEGBD_ =
                  input.readMessage(emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_);
                aDCLBBDEGBD_ = subBuilder.buildPartial();
              }
              aDCLBBDEGBDCase_ = 9;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.internal_static_MGHDLMIEMLI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.internal_static_MGHDLMIEMLI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI.class, emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI.Builder.class);
    }

    private int aDCLBBDEGBDCase_ = 0;
    private java.lang.Object aDCLBBDEGBD_;
    public enum ADCLBBDEGBDCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      DETAIL_ABILITY_INFO(9),
      ADCLBBDEGBD_NOT_SET(0);
      private final int value;
      private ADCLBBDEGBDCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ADCLBBDEGBDCase valueOf(int value) {
        return forNumber(value);
      }

      public static ADCLBBDEGBDCase forNumber(int value) {
        switch (value) {
          case 9: return DETAIL_ABILITY_INFO;
          case 0: return ADCLBBDEGBD_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ADCLBBDEGBDCase
    getADCLBBDEGBDCase() {
      return ADCLBBDEGBDCase.forNumber(
          aDCLBBDEGBDCase_);
    }

    public static final int DETAIL_ABILITY_INFO_FIELD_NUMBER = 9;
    /**
     * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
     * @return Whether the detailAbilityInfo field is set.
     */
    @java.lang.Override
    public boolean hasDetailAbilityInfo() {
      return aDCLBBDEGBDCase_ == 9;
    }
    /**
     * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
     * @return The detailAbilityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO getDetailAbilityInfo() {
      if (aDCLBBDEGBDCase_ == 9) {
         return (emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_;
      }
      return emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.getDefaultInstance();
    }
    /**
     * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIOOrBuilder getDetailAbilityInfoOrBuilder() {
      if (aDCLBBDEGBDCase_ == 9) {
         return (emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_;
      }
      return emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (aDCLBBDEGBDCase_ == 9) {
        output.writeMessage(9, (emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aDCLBBDEGBDCase_ == 9) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, (emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI other = (emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI) obj;

      if (!getADCLBBDEGBDCase().equals(other.getADCLBBDEGBDCase())) return false;
      switch (aDCLBBDEGBDCase_) {
        case 9:
          if (!getDetailAbilityInfo()
              .equals(other.getDetailAbilityInfo())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      switch (aDCLBBDEGBDCase_) {
        case 9:
          hash = (37 * hash) + DETAIL_ABILITY_INFO_FIELD_NUMBER;
          hash = (53 * hash) + getDetailAbilityInfo().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MGHDLMIEMLI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MGHDLMIEMLI)
        emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.internal_static_MGHDLMIEMLI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.internal_static_MGHDLMIEMLI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI.class, emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        aDCLBBDEGBDCase_ = 0;
        aDCLBBDEGBD_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.internal_static_MGHDLMIEMLI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI build() {
        emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI buildPartial() {
        emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI result = new emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI(this);
        if (aDCLBBDEGBDCase_ == 9) {
          if (detailAbilityInfoBuilder_ == null) {
            result.aDCLBBDEGBD_ = aDCLBBDEGBD_;
          } else {
            result.aDCLBBDEGBD_ = detailAbilityInfoBuilder_.build();
          }
        }
        result.aDCLBBDEGBDCase_ = aDCLBBDEGBDCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI) {
          return mergeFrom((emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI other) {
        if (other == emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI.getDefaultInstance()) return this;
        switch (other.getADCLBBDEGBDCase()) {
          case DETAIL_ABILITY_INFO: {
            mergeDetailAbilityInfo(other.getDetailAbilityInfo());
            break;
          }
          case ADCLBBDEGBD_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int aDCLBBDEGBDCase_ = 0;
      private java.lang.Object aDCLBBDEGBD_;
      public ADCLBBDEGBDCase
          getADCLBBDEGBDCase() {
        return ADCLBBDEGBDCase.forNumber(
            aDCLBBDEGBDCase_);
      }

      public Builder clearADCLBBDEGBD() {
        aDCLBBDEGBDCase_ = 0;
        aDCLBBDEGBD_ = null;
        onChanged();
        return this;
      }


      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO, emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.Builder, emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIOOrBuilder> detailAbilityInfoBuilder_;
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       * @return Whether the detailAbilityInfo field is set.
       */
      @java.lang.Override
      public boolean hasDetailAbilityInfo() {
        return aDCLBBDEGBDCase_ == 9;
      }
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       * @return The detailAbilityInfo.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO getDetailAbilityInfo() {
        if (detailAbilityInfoBuilder_ == null) {
          if (aDCLBBDEGBDCase_ == 9) {
            return (emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_;
          }
          return emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.getDefaultInstance();
        } else {
          if (aDCLBBDEGBDCase_ == 9) {
            return detailAbilityInfoBuilder_.getMessage();
          }
          return emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.getDefaultInstance();
        }
      }
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       */
      public Builder setDetailAbilityInfo(emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO value) {
        if (detailAbilityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          aDCLBBDEGBD_ = value;
          onChanged();
        } else {
          detailAbilityInfoBuilder_.setMessage(value);
        }
        aDCLBBDEGBDCase_ = 9;
        return this;
      }
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       */
      public Builder setDetailAbilityInfo(
          emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.Builder builderForValue) {
        if (detailAbilityInfoBuilder_ == null) {
          aDCLBBDEGBD_ = builderForValue.build();
          onChanged();
        } else {
          detailAbilityInfoBuilder_.setMessage(builderForValue.build());
        }
        aDCLBBDEGBDCase_ = 9;
        return this;
      }
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       */
      public Builder mergeDetailAbilityInfo(emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO value) {
        if (detailAbilityInfoBuilder_ == null) {
          if (aDCLBBDEGBDCase_ == 9 &&
              aDCLBBDEGBD_ != emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.getDefaultInstance()) {
            aDCLBBDEGBD_ = emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.newBuilder((emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_)
                .mergeFrom(value).buildPartial();
          } else {
            aDCLBBDEGBD_ = value;
          }
          onChanged();
        } else {
          if (aDCLBBDEGBDCase_ == 9) {
            detailAbilityInfoBuilder_.mergeFrom(value);
          }
          detailAbilityInfoBuilder_.setMessage(value);
        }
        aDCLBBDEGBDCase_ = 9;
        return this;
      }
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       */
      public Builder clearDetailAbilityInfo() {
        if (detailAbilityInfoBuilder_ == null) {
          if (aDCLBBDEGBDCase_ == 9) {
            aDCLBBDEGBDCase_ = 0;
            aDCLBBDEGBD_ = null;
            onChanged();
          }
        } else {
          if (aDCLBBDEGBDCase_ == 9) {
            aDCLBBDEGBDCase_ = 0;
            aDCLBBDEGBD_ = null;
          }
          detailAbilityInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       */
      public emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.Builder getDetailAbilityInfoBuilder() {
        return getDetailAbilityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIOOrBuilder getDetailAbilityInfoOrBuilder() {
        if ((aDCLBBDEGBDCase_ == 9) && (detailAbilityInfoBuilder_ != null)) {
          return detailAbilityInfoBuilder_.getMessageOrBuilder();
        } else {
          if (aDCLBBDEGBDCase_ == 9) {
            return (emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_;
          }
          return emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.getDefaultInstance();
        }
      }
      /**
       * <code>.HICCLGEKCIO detail_ability_info = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO, emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.Builder, emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIOOrBuilder> 
          getDetailAbilityInfoFieldBuilder() {
        if (detailAbilityInfoBuilder_ == null) {
          if (!(aDCLBBDEGBDCase_ == 9)) {
            aDCLBBDEGBD_ = emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.getDefaultInstance();
          }
          detailAbilityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO, emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO.Builder, emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIOOrBuilder>(
                  (emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.HICCLGEKCIO) aDCLBBDEGBD_,
                  getParentForChildren(),
                  isClean());
          aDCLBBDEGBD_ = null;
        }
        aDCLBBDEGBDCase_ = 9;
        onChanged();;
        return detailAbilityInfoBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MGHDLMIEMLI)
    }

    // @@protoc_insertion_point(class_scope:MGHDLMIEMLI)
    private static final emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI();
    }

    public static emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MGHDLMIEMLI>
        PARSER = new com.google.protobuf.AbstractParser<MGHDLMIEMLI>() {
      @java.lang.Override
      public MGHDLMIEMLI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MGHDLMIEMLI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MGHDLMIEMLI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MGHDLMIEMLI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MGHDLMIEMLIOuterClass.MGHDLMIEMLI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MGHDLMIEMLI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MGHDLMIEMLI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MGHDLMIEMLI.proto\032\021HICCLGEKCIO.proto\"I" +
      "\n\013MGHDLMIEMLI\022+\n\023detail_ability_info\030\t \001" +
      "(\0132\014.HICCLGEKCIOH\000B\r\n\013ADCLBBDEGBDB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.getDescriptor(),
        });
    internal_static_MGHDLMIEMLI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MGHDLMIEMLI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MGHDLMIEMLI_descriptor,
        new java.lang.String[] { "DetailAbilityInfo", "ADCLBBDEGBD", });
    emu.grasscutter.net.proto.HICCLGEKCIOOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
