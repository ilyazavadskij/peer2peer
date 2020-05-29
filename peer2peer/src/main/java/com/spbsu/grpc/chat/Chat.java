package com.spbsu.grpc.chat;

public final class Chat {
  private Chat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.spbsu.grpc.chat.ChatMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string host = 1;</code>
     */
    java.lang.String getHost();
    /**
     * <code>string host = 1;</code>
     */
    com.google.protobuf.ByteString
        getHostBytes();

    /**
     * <code>string port = 2;</code>
     */
    java.lang.String getPort();
    /**
     * <code>string port = 2;</code>
     */
    com.google.protobuf.ByteString
        getPortBytes();

    /**
     * <code>string from = 3;</code>
     */
    java.lang.String getFrom();
    /**
     * <code>string from = 3;</code>
     */
    com.google.protobuf.ByteString
        getFromBytes();

    /**
     * <code>string message = 4;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 4;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code com.spbsu.grpc.chat.ChatMessage}
   */
  public  static final class ChatMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.spbsu.grpc.chat.ChatMessage)
      ChatMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatMessage.newBuilder() to construct.
    private ChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatMessage() {
      host_ = "";
      port_ = "";
      from_ = "";
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              host_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              port_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              from_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.spbsu.grpc.chat.Chat.ChatMessage.class, com.spbsu.grpc.chat.Chat.ChatMessage.Builder.class);
    }

    public static final int HOST_FIELD_NUMBER = 1;
    private volatile java.lang.Object host_;
    /**
     * <code>string host = 1;</code>
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      }
    }
    /**
     * <code>string host = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private volatile java.lang.Object port_;
    /**
     * <code>string port = 2;</code>
     */
    public java.lang.String getPort() {
      java.lang.Object ref = port_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        port_ = s;
        return s;
      }
    }
    /**
     * <code>string port = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPortBytes() {
      java.lang.Object ref = port_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        port_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FROM_FIELD_NUMBER = 3;
    private volatile java.lang.Object from_;
    /**
     * <code>string from = 3;</code>
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      }
    }
    /**
     * <code>string from = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 4;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 4;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getHostBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, host_);
      }
      if (!getPortBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, port_);
      }
      if (!getFromBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, from_);
      }
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, message_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getHostBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, host_);
      }
      if (!getPortBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, port_);
      }
      if (!getFromBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, from_);
      }
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, message_);
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
      if (!(obj instanceof com.spbsu.grpc.chat.Chat.ChatMessage)) {
        return super.equals(obj);
      }
      com.spbsu.grpc.chat.Chat.ChatMessage other = (com.spbsu.grpc.chat.Chat.ChatMessage) obj;

      boolean result = true;
      result = result && getHost()
          .equals(other.getHost());
      result = result && getPort()
          .equals(other.getPort());
      result = result && getFrom()
          .equals(other.getFrom());
      result = result && getMessage()
          .equals(other.getMessage());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
      hash = (37 * hash) + PORT_FIELD_NUMBER;
      hash = (53 * hash) + getPort().hashCode();
      hash = (37 * hash) + FROM_FIELD_NUMBER;
      hash = (53 * hash) + getFrom().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessage parseFrom(
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
    public static Builder newBuilder(com.spbsu.grpc.chat.Chat.ChatMessage prototype) {
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
     * Protobuf type {@code com.spbsu.grpc.chat.ChatMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.spbsu.grpc.chat.ChatMessage)
        com.spbsu.grpc.chat.Chat.ChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.spbsu.grpc.chat.Chat.ChatMessage.class, com.spbsu.grpc.chat.Chat.ChatMessage.Builder.class);
      }

      // Construct using com.spbsu.grpc.chat.Chat.ChatMessage.newBuilder()
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
        host_ = "";

        port_ = "";

        from_ = "";

        message_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessage_descriptor;
      }

      @java.lang.Override
      public com.spbsu.grpc.chat.Chat.ChatMessage getDefaultInstanceForType() {
        return com.spbsu.grpc.chat.Chat.ChatMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.spbsu.grpc.chat.Chat.ChatMessage build() {
        com.spbsu.grpc.chat.Chat.ChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.spbsu.grpc.chat.Chat.ChatMessage buildPartial() {
        com.spbsu.grpc.chat.Chat.ChatMessage result = new com.spbsu.grpc.chat.Chat.ChatMessage(this);
        result.host_ = host_;
        result.port_ = port_;
        result.from_ = from_;
        result.message_ = message_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.spbsu.grpc.chat.Chat.ChatMessage) {
          return mergeFrom((com.spbsu.grpc.chat.Chat.ChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.spbsu.grpc.chat.Chat.ChatMessage other) {
        if (other == com.spbsu.grpc.chat.Chat.ChatMessage.getDefaultInstance()) return this;
        if (!other.getHost().isEmpty()) {
          host_ = other.host_;
          onChanged();
        }
        if (!other.getPort().isEmpty()) {
          port_ = other.port_;
          onChanged();
        }
        if (!other.getFrom().isEmpty()) {
          from_ = other.from_;
          onChanged();
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
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
        com.spbsu.grpc.chat.Chat.ChatMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.spbsu.grpc.chat.Chat.ChatMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object host_ = "";
      /**
       * <code>string host = 1;</code>
       */
      public java.lang.String getHost() {
        java.lang.Object ref = host_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          host_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string host = 1;</code>
       */
      public com.google.protobuf.ByteString
          getHostBytes() {
        java.lang.Object ref = host_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          host_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string host = 1;</code>
       */
      public Builder setHost(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        host_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string host = 1;</code>
       */
      public Builder clearHost() {
        
        host_ = getDefaultInstance().getHost();
        onChanged();
        return this;
      }
      /**
       * <code>string host = 1;</code>
       */
      public Builder setHostBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        host_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object port_ = "";
      /**
       * <code>string port = 2;</code>
       */
      public java.lang.String getPort() {
        java.lang.Object ref = port_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          port_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string port = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPortBytes() {
        java.lang.Object ref = port_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          port_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string port = 2;</code>
       */
      public Builder setPort(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string port = 2;</code>
       */
      public Builder clearPort() {
        
        port_ = getDefaultInstance().getPort();
        onChanged();
        return this;
      }
      /**
       * <code>string port = 2;</code>
       */
      public Builder setPortBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        port_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object from_ = "";
      /**
       * <code>string from = 3;</code>
       */
      public java.lang.String getFrom() {
        java.lang.Object ref = from_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string from = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFromBytes() {
        java.lang.Object ref = from_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          from_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string from = 3;</code>
       */
      public Builder setFrom(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        from_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string from = 3;</code>
       */
      public Builder clearFrom() {
        
        from_ = getDefaultInstance().getFrom();
        onChanged();
        return this;
      }
      /**
       * <code>string from = 3;</code>
       */
      public Builder setFromBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        from_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 4;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 4;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 4;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 4;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 4;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.spbsu.grpc.chat.ChatMessage)
    }

    // @@protoc_insertion_point(class_scope:com.spbsu.grpc.chat.ChatMessage)
    private static final com.spbsu.grpc.chat.Chat.ChatMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.spbsu.grpc.chat.Chat.ChatMessage();
    }

    public static com.spbsu.grpc.chat.Chat.ChatMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatMessage>
        PARSER = new com.google.protobuf.AbstractParser<ChatMessage>() {
      @java.lang.Override
      public ChatMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.spbsu.grpc.chat.Chat.ChatMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChatMessageFromServerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.spbsu.grpc.chat.ChatMessageFromServer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    com.google.protobuf.Timestamp getTimestamp();
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

    /**
     * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
     */
    boolean hasMessage();
    /**
     * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
     */
    com.spbsu.grpc.chat.Chat.ChatMessage getMessage();
    /**
     * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
     */
    com.spbsu.grpc.chat.Chat.ChatMessageOrBuilder getMessageOrBuilder();
  }
  /**
   * Protobuf type {@code com.spbsu.grpc.chat.ChatMessageFromServer}
   */
  public  static final class ChatMessageFromServer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.spbsu.grpc.chat.ChatMessageFromServer)
      ChatMessageFromServerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatMessageFromServer.newBuilder() to construct.
    private ChatMessageFromServer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatMessageFromServer() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatMessageFromServer(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (timestamp_ != null) {
                subBuilder = timestamp_.toBuilder();
              }
              timestamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(timestamp_);
                timestamp_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              com.spbsu.grpc.chat.Chat.ChatMessage.Builder subBuilder = null;
              if (message_ != null) {
                subBuilder = message_.toBuilder();
              }
              message_ = input.readMessage(com.spbsu.grpc.chat.Chat.ChatMessage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(message_);
                message_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.spbsu.grpc.chat.Chat.ChatMessageFromServer.class, com.spbsu.grpc.chat.Chat.ChatMessageFromServer.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private com.google.protobuf.Timestamp timestamp_;
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public boolean hasTimestamp() {
      return timestamp_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      return getTimestamp();
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private com.spbsu.grpc.chat.Chat.ChatMessage message_;
    /**
     * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
     */
    public boolean hasMessage() {
      return message_ != null;
    }
    /**
     * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
     */
    public com.spbsu.grpc.chat.Chat.ChatMessage getMessage() {
      return message_ == null ? com.spbsu.grpc.chat.Chat.ChatMessage.getDefaultInstance() : message_;
    }
    /**
     * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
     */
    public com.spbsu.grpc.chat.Chat.ChatMessageOrBuilder getMessageOrBuilder() {
      return getMessage();
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
      if (timestamp_ != null) {
        output.writeMessage(1, getTimestamp());
      }
      if (message_ != null) {
        output.writeMessage(2, getMessage());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getTimestamp());
      }
      if (message_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMessage());
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
      if (!(obj instanceof com.spbsu.grpc.chat.Chat.ChatMessageFromServer)) {
        return super.equals(obj);
      }
      com.spbsu.grpc.chat.Chat.ChatMessageFromServer other = (com.spbsu.grpc.chat.Chat.ChatMessageFromServer) obj;

      boolean result = true;
      result = result && (hasTimestamp() == other.hasTimestamp());
      if (hasTimestamp()) {
        result = result && getTimestamp()
            .equals(other.getTimestamp());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage()
            .equals(other.getMessage());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + getTimestamp().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer parseFrom(
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
    public static Builder newBuilder(com.spbsu.grpc.chat.Chat.ChatMessageFromServer prototype) {
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
     * Protobuf type {@code com.spbsu.grpc.chat.ChatMessageFromServer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.spbsu.grpc.chat.ChatMessageFromServer)
        com.spbsu.grpc.chat.Chat.ChatMessageFromServerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.spbsu.grpc.chat.Chat.ChatMessageFromServer.class, com.spbsu.grpc.chat.Chat.ChatMessageFromServer.Builder.class);
      }

      // Construct using com.spbsu.grpc.chat.Chat.ChatMessageFromServer.newBuilder()
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
        if (timestampBuilder_ == null) {
          timestamp_ = null;
        } else {
          timestamp_ = null;
          timestampBuilder_ = null;
        }
        if (messageBuilder_ == null) {
          message_ = null;
        } else {
          message_ = null;
          messageBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.spbsu.grpc.chat.Chat.internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_descriptor;
      }

      @java.lang.Override
      public com.spbsu.grpc.chat.Chat.ChatMessageFromServer getDefaultInstanceForType() {
        return com.spbsu.grpc.chat.Chat.ChatMessageFromServer.getDefaultInstance();
      }

      @java.lang.Override
      public com.spbsu.grpc.chat.Chat.ChatMessageFromServer build() {
        com.spbsu.grpc.chat.Chat.ChatMessageFromServer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.spbsu.grpc.chat.Chat.ChatMessageFromServer buildPartial() {
        com.spbsu.grpc.chat.Chat.ChatMessageFromServer result = new com.spbsu.grpc.chat.Chat.ChatMessageFromServer(this);
        if (timestampBuilder_ == null) {
          result.timestamp_ = timestamp_;
        } else {
          result.timestamp_ = timestampBuilder_.build();
        }
        if (messageBuilder_ == null) {
          result.message_ = message_;
        } else {
          result.message_ = messageBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.spbsu.grpc.chat.Chat.ChatMessageFromServer) {
          return mergeFrom((com.spbsu.grpc.chat.Chat.ChatMessageFromServer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.spbsu.grpc.chat.Chat.ChatMessageFromServer other) {
        if (other == com.spbsu.grpc.chat.Chat.ChatMessageFromServer.getDefaultInstance()) return this;
        if (other.hasTimestamp()) {
          mergeTimestamp(other.getTimestamp());
        }
        if (other.hasMessage()) {
          mergeMessage(other.getMessage());
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
        com.spbsu.grpc.chat.Chat.ChatMessageFromServer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.spbsu.grpc.chat.Chat.ChatMessageFromServer) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Timestamp timestamp_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public boolean hasTimestamp() {
        return timestampBuilder_ != null || timestamp_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public com.google.protobuf.Timestamp getTimestamp() {
        if (timestampBuilder_ == null) {
          return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
        } else {
          return timestampBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public Builder setTimestamp(com.google.protobuf.Timestamp value) {
        if (timestampBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          timestamp_ = value;
          onChanged();
        } else {
          timestampBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public Builder setTimestamp(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (timestampBuilder_ == null) {
          timestamp_ = builderForValue.build();
          onChanged();
        } else {
          timestampBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
        if (timestampBuilder_ == null) {
          if (timestamp_ != null) {
            timestamp_ =
              com.google.protobuf.Timestamp.newBuilder(timestamp_).mergeFrom(value).buildPartial();
          } else {
            timestamp_ = value;
          }
          onChanged();
        } else {
          timestampBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public Builder clearTimestamp() {
        if (timestampBuilder_ == null) {
          timestamp_ = null;
          onChanged();
        } else {
          timestamp_ = null;
          timestampBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
        
        onChanged();
        return getTimestampFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
        if (timestampBuilder_ != null) {
          return timestampBuilder_.getMessageOrBuilder();
        } else {
          return timestamp_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getTimestampFieldBuilder() {
        if (timestampBuilder_ == null) {
          timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getTimestamp(),
                  getParentForChildren(),
                  isClean());
          timestamp_ = null;
        }
        return timestampBuilder_;
      }

      private com.spbsu.grpc.chat.Chat.ChatMessage message_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.spbsu.grpc.chat.Chat.ChatMessage, com.spbsu.grpc.chat.Chat.ChatMessage.Builder, com.spbsu.grpc.chat.Chat.ChatMessageOrBuilder> messageBuilder_;
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      public boolean hasMessage() {
        return messageBuilder_ != null || message_ != null;
      }
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      public com.spbsu.grpc.chat.Chat.ChatMessage getMessage() {
        if (messageBuilder_ == null) {
          return message_ == null ? com.spbsu.grpc.chat.Chat.ChatMessage.getDefaultInstance() : message_;
        } else {
          return messageBuilder_.getMessage();
        }
      }
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      public Builder setMessage(com.spbsu.grpc.chat.Chat.ChatMessage value) {
        if (messageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          message_ = value;
          onChanged();
        } else {
          messageBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      public Builder setMessage(
          com.spbsu.grpc.chat.Chat.ChatMessage.Builder builderForValue) {
        if (messageBuilder_ == null) {
          message_ = builderForValue.build();
          onChanged();
        } else {
          messageBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      public Builder mergeMessage(com.spbsu.grpc.chat.Chat.ChatMessage value) {
        if (messageBuilder_ == null) {
          if (message_ != null) {
            message_ =
              com.spbsu.grpc.chat.Chat.ChatMessage.newBuilder(message_).mergeFrom(value).buildPartial();
          } else {
            message_ = value;
          }
          onChanged();
        } else {
          messageBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      public Builder clearMessage() {
        if (messageBuilder_ == null) {
          message_ = null;
          onChanged();
        } else {
          message_ = null;
          messageBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      public com.spbsu.grpc.chat.Chat.ChatMessage.Builder getMessageBuilder() {
        
        onChanged();
        return getMessageFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      public com.spbsu.grpc.chat.Chat.ChatMessageOrBuilder getMessageOrBuilder() {
        if (messageBuilder_ != null) {
          return messageBuilder_.getMessageOrBuilder();
        } else {
          return message_ == null ?
              com.spbsu.grpc.chat.Chat.ChatMessage.getDefaultInstance() : message_;
        }
      }
      /**
       * <code>.com.spbsu.grpc.chat.ChatMessage message = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.spbsu.grpc.chat.Chat.ChatMessage, com.spbsu.grpc.chat.Chat.ChatMessage.Builder, com.spbsu.grpc.chat.Chat.ChatMessageOrBuilder> 
          getMessageFieldBuilder() {
        if (messageBuilder_ == null) {
          messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.spbsu.grpc.chat.Chat.ChatMessage, com.spbsu.grpc.chat.Chat.ChatMessage.Builder, com.spbsu.grpc.chat.Chat.ChatMessageOrBuilder>(
                  getMessage(),
                  getParentForChildren(),
                  isClean());
          message_ = null;
        }
        return messageBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.spbsu.grpc.chat.ChatMessageFromServer)
    }

    // @@protoc_insertion_point(class_scope:com.spbsu.grpc.chat.ChatMessageFromServer)
    private static final com.spbsu.grpc.chat.Chat.ChatMessageFromServer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.spbsu.grpc.chat.Chat.ChatMessageFromServer();
    }

    public static com.spbsu.grpc.chat.Chat.ChatMessageFromServer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatMessageFromServer>
        PARSER = new com.google.protobuf.AbstractParser<ChatMessageFromServer>() {
      @java.lang.Override
      public ChatMessageFromServer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatMessageFromServer(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatMessageFromServer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatMessageFromServer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.spbsu.grpc.chat.Chat.ChatMessageFromServer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_spbsu_grpc_chat_ChatMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_spbsu_grpc_chat_ChatMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nChat.proto\022\023com.spbsu.grpc.chat\032\037googl" +
      "e/protobuf/timestamp.proto\"H\n\013ChatMessag" +
      "e\022\014\n\004host\030\001 \001(\t\022\014\n\004port\030\002 \001(\t\022\014\n\004from\030\003 " +
      "\001(\t\022\017\n\007message\030\004 \001(\t\"y\n\025ChatMessageFromS" +
      "erver\022-\n\ttimestamp\030\001 \001(\0132\032.google.protob" +
      "uf.Timestamp\0221\n\007message\030\002 \001(\0132 .com.spbs" +
      "u.grpc.chat.ChatMessage2g\n\013ChatService\022X" +
      "\n\004chat\022 .com.spbsu.grpc.chat.ChatMessage" +
      "\032*.com.spbsu.grpc.chat.ChatMessageFromSe" +
      "rver(\0010\001b\006proto3"
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
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_com_spbsu_grpc_chat_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_spbsu_grpc_chat_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_spbsu_grpc_chat_ChatMessage_descriptor,
        new java.lang.String[] { "Host", "Port", "From", "Message", });
    internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_spbsu_grpc_chat_ChatMessageFromServer_descriptor,
        new java.lang.String[] { "Timestamp", "Message", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}