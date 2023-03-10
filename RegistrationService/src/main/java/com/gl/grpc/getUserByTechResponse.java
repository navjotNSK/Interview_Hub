// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: getUsersByTechStack.proto

package com.gl.grpc;

/**
 * Protobuf type {@code registration.getUserByTechResponse}
 */
public  final class getUserByTechResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:registration.getUserByTechResponse)
    getUserByTechResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getUserByTechResponse.newBuilder() to construct.
  private getUserByTechResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getUserByTechResponse() {
    userProfileArray_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getUserByTechResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              userProfileArray_ = new java.util.ArrayList<com.gl.grpc.userProfile>();
              mutable_bitField0_ |= 0x00000001;
            }
            userProfileArray_.add(
                input.readMessage(com.gl.grpc.userProfile.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        userProfileArray_ = java.util.Collections.unmodifiableList(userProfileArray_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gl.grpc.GetUsersByTechStack.internal_static_registration_getUserByTechResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gl.grpc.GetUsersByTechStack.internal_static_registration_getUserByTechResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gl.grpc.getUserByTechResponse.class, com.gl.grpc.getUserByTechResponse.Builder.class);
  }

  public static final int USERPROFILEARRAY_FIELD_NUMBER = 1;
  private java.util.List<com.gl.grpc.userProfile> userProfileArray_;
  /**
   * <code>repeated .registration.userProfile userProfileArray = 1;</code>
   */
  public java.util.List<com.gl.grpc.userProfile> getUserProfileArrayList() {
    return userProfileArray_;
  }
  /**
   * <code>repeated .registration.userProfile userProfileArray = 1;</code>
   */
  public java.util.List<? extends com.gl.grpc.userProfileOrBuilder> 
      getUserProfileArrayOrBuilderList() {
    return userProfileArray_;
  }
  /**
   * <code>repeated .registration.userProfile userProfileArray = 1;</code>
   */
  public int getUserProfileArrayCount() {
    return userProfileArray_.size();
  }
  /**
   * <code>repeated .registration.userProfile userProfileArray = 1;</code>
   */
  public com.gl.grpc.userProfile getUserProfileArray(int index) {
    return userProfileArray_.get(index);
  }
  /**
   * <code>repeated .registration.userProfile userProfileArray = 1;</code>
   */
  public com.gl.grpc.userProfileOrBuilder getUserProfileArrayOrBuilder(
      int index) {
    return userProfileArray_.get(index);
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
    for (int i = 0; i < userProfileArray_.size(); i++) {
      output.writeMessage(1, userProfileArray_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userProfileArray_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userProfileArray_.get(i));
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
    if (!(obj instanceof com.gl.grpc.getUserByTechResponse)) {
      return super.equals(obj);
    }
    com.gl.grpc.getUserByTechResponse other = (com.gl.grpc.getUserByTechResponse) obj;

    boolean result = true;
    result = result && getUserProfileArrayList()
        .equals(other.getUserProfileArrayList());
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
    if (getUserProfileArrayCount() > 0) {
      hash = (37 * hash) + USERPROFILEARRAY_FIELD_NUMBER;
      hash = (53 * hash) + getUserProfileArrayList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gl.grpc.getUserByTechResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gl.grpc.getUserByTechResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gl.grpc.getUserByTechResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gl.grpc.getUserByTechResponse parseFrom(
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
  public static Builder newBuilder(com.gl.grpc.getUserByTechResponse prototype) {
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
   * Protobuf type {@code registration.getUserByTechResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:registration.getUserByTechResponse)
      com.gl.grpc.getUserByTechResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gl.grpc.GetUsersByTechStack.internal_static_registration_getUserByTechResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gl.grpc.GetUsersByTechStack.internal_static_registration_getUserByTechResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gl.grpc.getUserByTechResponse.class, com.gl.grpc.getUserByTechResponse.Builder.class);
    }

    // Construct using com.gl.grpc.getUserByTechResponse.newBuilder()
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
        getUserProfileArrayFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userProfileArrayBuilder_ == null) {
        userProfileArray_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userProfileArrayBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gl.grpc.GetUsersByTechStack.internal_static_registration_getUserByTechResponse_descriptor;
    }

    @java.lang.Override
    public com.gl.grpc.getUserByTechResponse getDefaultInstanceForType() {
      return com.gl.grpc.getUserByTechResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.gl.grpc.getUserByTechResponse build() {
      com.gl.grpc.getUserByTechResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gl.grpc.getUserByTechResponse buildPartial() {
      com.gl.grpc.getUserByTechResponse result = new com.gl.grpc.getUserByTechResponse(this);
      int from_bitField0_ = bitField0_;
      if (userProfileArrayBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          userProfileArray_ = java.util.Collections.unmodifiableList(userProfileArray_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userProfileArray_ = userProfileArray_;
      } else {
        result.userProfileArray_ = userProfileArrayBuilder_.build();
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
      if (other instanceof com.gl.grpc.getUserByTechResponse) {
        return mergeFrom((com.gl.grpc.getUserByTechResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gl.grpc.getUserByTechResponse other) {
      if (other == com.gl.grpc.getUserByTechResponse.getDefaultInstance()) return this;
      if (userProfileArrayBuilder_ == null) {
        if (!other.userProfileArray_.isEmpty()) {
          if (userProfileArray_.isEmpty()) {
            userProfileArray_ = other.userProfileArray_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserProfileArrayIsMutable();
            userProfileArray_.addAll(other.userProfileArray_);
          }
          onChanged();
        }
      } else {
        if (!other.userProfileArray_.isEmpty()) {
          if (userProfileArrayBuilder_.isEmpty()) {
            userProfileArrayBuilder_.dispose();
            userProfileArrayBuilder_ = null;
            userProfileArray_ = other.userProfileArray_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userProfileArrayBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserProfileArrayFieldBuilder() : null;
          } else {
            userProfileArrayBuilder_.addAllMessages(other.userProfileArray_);
          }
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
      com.gl.grpc.getUserByTechResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gl.grpc.getUserByTechResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.gl.grpc.userProfile> userProfileArray_ =
      java.util.Collections.emptyList();
    private void ensureUserProfileArrayIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        userProfileArray_ = new java.util.ArrayList<com.gl.grpc.userProfile>(userProfileArray_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.gl.grpc.userProfile, com.gl.grpc.userProfile.Builder, com.gl.grpc.userProfileOrBuilder> userProfileArrayBuilder_;

    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public java.util.List<com.gl.grpc.userProfile> getUserProfileArrayList() {
      if (userProfileArrayBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userProfileArray_);
      } else {
        return userProfileArrayBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public int getUserProfileArrayCount() {
      if (userProfileArrayBuilder_ == null) {
        return userProfileArray_.size();
      } else {
        return userProfileArrayBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public com.gl.grpc.userProfile getUserProfileArray(int index) {
      if (userProfileArrayBuilder_ == null) {
        return userProfileArray_.get(index);
      } else {
        return userProfileArrayBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder setUserProfileArray(
        int index, com.gl.grpc.userProfile value) {
      if (userProfileArrayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserProfileArrayIsMutable();
        userProfileArray_.set(index, value);
        onChanged();
      } else {
        userProfileArrayBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder setUserProfileArray(
        int index, com.gl.grpc.userProfile.Builder builderForValue) {
      if (userProfileArrayBuilder_ == null) {
        ensureUserProfileArrayIsMutable();
        userProfileArray_.set(index, builderForValue.build());
        onChanged();
      } else {
        userProfileArrayBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder addUserProfileArray(com.gl.grpc.userProfile value) {
      if (userProfileArrayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserProfileArrayIsMutable();
        userProfileArray_.add(value);
        onChanged();
      } else {
        userProfileArrayBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder addUserProfileArray(
        int index, com.gl.grpc.userProfile value) {
      if (userProfileArrayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserProfileArrayIsMutable();
        userProfileArray_.add(index, value);
        onChanged();
      } else {
        userProfileArrayBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder addUserProfileArray(
        com.gl.grpc.userProfile.Builder builderForValue) {
      if (userProfileArrayBuilder_ == null) {
        ensureUserProfileArrayIsMutable();
        userProfileArray_.add(builderForValue.build());
        onChanged();
      } else {
        userProfileArrayBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder addUserProfileArray(
        int index, com.gl.grpc.userProfile.Builder builderForValue) {
      if (userProfileArrayBuilder_ == null) {
        ensureUserProfileArrayIsMutable();
        userProfileArray_.add(index, builderForValue.build());
        onChanged();
      } else {
        userProfileArrayBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder addAllUserProfileArray(
        java.lang.Iterable<? extends com.gl.grpc.userProfile> values) {
      if (userProfileArrayBuilder_ == null) {
        ensureUserProfileArrayIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userProfileArray_);
        onChanged();
      } else {
        userProfileArrayBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder clearUserProfileArray() {
      if (userProfileArrayBuilder_ == null) {
        userProfileArray_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userProfileArrayBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public Builder removeUserProfileArray(int index) {
      if (userProfileArrayBuilder_ == null) {
        ensureUserProfileArrayIsMutable();
        userProfileArray_.remove(index);
        onChanged();
      } else {
        userProfileArrayBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public com.gl.grpc.userProfile.Builder getUserProfileArrayBuilder(
        int index) {
      return getUserProfileArrayFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public com.gl.grpc.userProfileOrBuilder getUserProfileArrayOrBuilder(
        int index) {
      if (userProfileArrayBuilder_ == null) {
        return userProfileArray_.get(index);  } else {
        return userProfileArrayBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public java.util.List<? extends com.gl.grpc.userProfileOrBuilder> 
         getUserProfileArrayOrBuilderList() {
      if (userProfileArrayBuilder_ != null) {
        return userProfileArrayBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userProfileArray_);
      }
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public com.gl.grpc.userProfile.Builder addUserProfileArrayBuilder() {
      return getUserProfileArrayFieldBuilder().addBuilder(
          com.gl.grpc.userProfile.getDefaultInstance());
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public com.gl.grpc.userProfile.Builder addUserProfileArrayBuilder(
        int index) {
      return getUserProfileArrayFieldBuilder().addBuilder(
          index, com.gl.grpc.userProfile.getDefaultInstance());
    }
    /**
     * <code>repeated .registration.userProfile userProfileArray = 1;</code>
     */
    public java.util.List<com.gl.grpc.userProfile.Builder> 
         getUserProfileArrayBuilderList() {
      return getUserProfileArrayFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.gl.grpc.userProfile, com.gl.grpc.userProfile.Builder, com.gl.grpc.userProfileOrBuilder> 
        getUserProfileArrayFieldBuilder() {
      if (userProfileArrayBuilder_ == null) {
        userProfileArrayBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.gl.grpc.userProfile, com.gl.grpc.userProfile.Builder, com.gl.grpc.userProfileOrBuilder>(
                userProfileArray_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        userProfileArray_ = null;
      }
      return userProfileArrayBuilder_;
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


    // @@protoc_insertion_point(builder_scope:registration.getUserByTechResponse)
  }

  // @@protoc_insertion_point(class_scope:registration.getUserByTechResponse)
  private static final com.gl.grpc.getUserByTechResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gl.grpc.getUserByTechResponse();
  }

  public static com.gl.grpc.getUserByTechResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getUserByTechResponse>
      PARSER = new com.google.protobuf.AbstractParser<getUserByTechResponse>() {
    @java.lang.Override
    public getUserByTechResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getUserByTechResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getUserByTechResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getUserByTechResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gl.grpc.getUserByTechResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

