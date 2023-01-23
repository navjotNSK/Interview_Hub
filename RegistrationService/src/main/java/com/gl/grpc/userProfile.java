// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: getUsersByTechStack.proto

package com.gl.grpc;

/**
 * Protobuf type {@code registration.userProfile}
 */
public  final class userProfile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:registration.userProfile)
    userProfileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use userProfile.newBuilder() to construct.
  private userProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private userProfile() {
    userName_ = "";
    phoneNo_ = 0L;
    emailId_ = "";
    userPassword_ = "";
    userRole_ = "";
    techStack_ = "";
    jobRole_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private userProfile(
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

            userName_ = s;
            break;
          }
          case 16: {

            phoneNo_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            emailId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            userPassword_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            userRole_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            techStack_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            jobRole_ = s;
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
    return com.gl.grpc.GetUsersByTechStack.internal_static_registration_userProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gl.grpc.GetUsersByTechStack.internal_static_registration_userProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gl.grpc.userProfile.class, com.gl.grpc.userProfile.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object userName_;
  /**
   * <code>string userName = 1;</code>
   */
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string userName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONENO_FIELD_NUMBER = 2;
  private long phoneNo_;
  /**
   * <code>int64 phoneNo = 2;</code>
   */
  public long getPhoneNo() {
    return phoneNo_;
  }

  public static final int EMAILID_FIELD_NUMBER = 3;
  private volatile java.lang.Object emailId_;
  /**
   * <code>string emailId = 3;</code>
   */
  public java.lang.String getEmailId() {
    java.lang.Object ref = emailId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailId_ = s;
      return s;
    }
  }
  /**
   * <code>string emailId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getEmailIdBytes() {
    java.lang.Object ref = emailId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERPASSWORD_FIELD_NUMBER = 4;
  private volatile java.lang.Object userPassword_;
  /**
   * <code>string userPassword = 4;</code>
   */
  public java.lang.String getUserPassword() {
    java.lang.Object ref = userPassword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userPassword_ = s;
      return s;
    }
  }
  /**
   * <code>string userPassword = 4;</code>
   */
  public com.google.protobuf.ByteString
      getUserPasswordBytes() {
    java.lang.Object ref = userPassword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userPassword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERROLE_FIELD_NUMBER = 5;
  private volatile java.lang.Object userRole_;
  /**
   * <code>string userRole = 5;</code>
   */
  public java.lang.String getUserRole() {
    java.lang.Object ref = userRole_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userRole_ = s;
      return s;
    }
  }
  /**
   * <code>string userRole = 5;</code>
   */
  public com.google.protobuf.ByteString
      getUserRoleBytes() {
    java.lang.Object ref = userRole_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userRole_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TECHSTACK_FIELD_NUMBER = 6;
  private volatile java.lang.Object techStack_;
  /**
   * <code>string techStack = 6;</code>
   */
  public java.lang.String getTechStack() {
    java.lang.Object ref = techStack_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      techStack_ = s;
      return s;
    }
  }
  /**
   * <code>string techStack = 6;</code>
   */
  public com.google.protobuf.ByteString
      getTechStackBytes() {
    java.lang.Object ref = techStack_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      techStack_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOBROLE_FIELD_NUMBER = 7;
  private volatile java.lang.Object jobRole_;
  /**
   * <code>string jobRole = 7;</code>
   */
  public java.lang.String getJobRole() {
    java.lang.Object ref = jobRole_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobRole_ = s;
      return s;
    }
  }
  /**
   * <code>string jobRole = 7;</code>
   */
  public com.google.protobuf.ByteString
      getJobRoleBytes() {
    java.lang.Object ref = jobRole_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobRole_ = b;
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
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userName_);
    }
    if (phoneNo_ != 0L) {
      output.writeInt64(2, phoneNo_);
    }
    if (!getEmailIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, emailId_);
    }
    if (!getUserPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, userPassword_);
    }
    if (!getUserRoleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, userRole_);
    }
    if (!getTechStackBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, techStack_);
    }
    if (!getJobRoleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, jobRole_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userName_);
    }
    if (phoneNo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, phoneNo_);
    }
    if (!getEmailIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, emailId_);
    }
    if (!getUserPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, userPassword_);
    }
    if (!getUserRoleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, userRole_);
    }
    if (!getTechStackBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, techStack_);
    }
    if (!getJobRoleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, jobRole_);
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
    if (!(obj instanceof com.gl.grpc.userProfile)) {
      return super.equals(obj);
    }
    com.gl.grpc.userProfile other = (com.gl.grpc.userProfile) obj;

    boolean result = true;
    result = result && getUserName()
        .equals(other.getUserName());
    result = result && (getPhoneNo()
        == other.getPhoneNo());
    result = result && getEmailId()
        .equals(other.getEmailId());
    result = result && getUserPassword()
        .equals(other.getUserPassword());
    result = result && getUserRole()
        .equals(other.getUserRole());
    result = result && getTechStack()
        .equals(other.getTechStack());
    result = result && getJobRole()
        .equals(other.getJobRole());
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + PHONENO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPhoneNo());
    hash = (37 * hash) + EMAILID_FIELD_NUMBER;
    hash = (53 * hash) + getEmailId().hashCode();
    hash = (37 * hash) + USERPASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getUserPassword().hashCode();
    hash = (37 * hash) + USERROLE_FIELD_NUMBER;
    hash = (53 * hash) + getUserRole().hashCode();
    hash = (37 * hash) + TECHSTACK_FIELD_NUMBER;
    hash = (53 * hash) + getTechStack().hashCode();
    hash = (37 * hash) + JOBROLE_FIELD_NUMBER;
    hash = (53 * hash) + getJobRole().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gl.grpc.userProfile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gl.grpc.userProfile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gl.grpc.userProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gl.grpc.userProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gl.grpc.userProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gl.grpc.userProfile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gl.grpc.userProfile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gl.grpc.userProfile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gl.grpc.userProfile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gl.grpc.userProfile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gl.grpc.userProfile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gl.grpc.userProfile parseFrom(
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
  public static Builder newBuilder(com.gl.grpc.userProfile prototype) {
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
   * Protobuf type {@code registration.userProfile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:registration.userProfile)
      com.gl.grpc.userProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gl.grpc.GetUsersByTechStack.internal_static_registration_userProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gl.grpc.GetUsersByTechStack.internal_static_registration_userProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gl.grpc.userProfile.class, com.gl.grpc.userProfile.Builder.class);
    }

    // Construct using com.gl.grpc.userProfile.newBuilder()
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
      userName_ = "";

      phoneNo_ = 0L;

      emailId_ = "";

      userPassword_ = "";

      userRole_ = "";

      techStack_ = "";

      jobRole_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gl.grpc.GetUsersByTechStack.internal_static_registration_userProfile_descriptor;
    }

    @java.lang.Override
    public com.gl.grpc.userProfile getDefaultInstanceForType() {
      return com.gl.grpc.userProfile.getDefaultInstance();
    }

    @java.lang.Override
    public com.gl.grpc.userProfile build() {
      com.gl.grpc.userProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gl.grpc.userProfile buildPartial() {
      com.gl.grpc.userProfile result = new com.gl.grpc.userProfile(this);
      result.userName_ = userName_;
      result.phoneNo_ = phoneNo_;
      result.emailId_ = emailId_;
      result.userPassword_ = userPassword_;
      result.userRole_ = userRole_;
      result.techStack_ = techStack_;
      result.jobRole_ = jobRole_;
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
      if (other instanceof com.gl.grpc.userProfile) {
        return mergeFrom((com.gl.grpc.userProfile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gl.grpc.userProfile other) {
      if (other == com.gl.grpc.userProfile.getDefaultInstance()) return this;
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (other.getPhoneNo() != 0L) {
        setPhoneNo(other.getPhoneNo());
      }
      if (!other.getEmailId().isEmpty()) {
        emailId_ = other.emailId_;
        onChanged();
      }
      if (!other.getUserPassword().isEmpty()) {
        userPassword_ = other.userPassword_;
        onChanged();
      }
      if (!other.getUserRole().isEmpty()) {
        userRole_ = other.userRole_;
        onChanged();
      }
      if (!other.getTechStack().isEmpty()) {
        techStack_ = other.techStack_;
        onChanged();
      }
      if (!other.getJobRole().isEmpty()) {
        jobRole_ = other.jobRole_;
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
      com.gl.grpc.userProfile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gl.grpc.userProfile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string userName = 1;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private long phoneNo_ ;
    /**
     * <code>int64 phoneNo = 2;</code>
     */
    public long getPhoneNo() {
      return phoneNo_;
    }
    /**
     * <code>int64 phoneNo = 2;</code>
     */
    public Builder setPhoneNo(long value) {
      
      phoneNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 phoneNo = 2;</code>
     */
    public Builder clearPhoneNo() {
      
      phoneNo_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object emailId_ = "";
    /**
     * <code>string emailId = 3;</code>
     */
    public java.lang.String getEmailId() {
      java.lang.Object ref = emailId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string emailId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEmailIdBytes() {
      java.lang.Object ref = emailId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string emailId = 3;</code>
     */
    public Builder setEmailId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      emailId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string emailId = 3;</code>
     */
    public Builder clearEmailId() {
      
      emailId_ = getDefaultInstance().getEmailId();
      onChanged();
      return this;
    }
    /**
     * <code>string emailId = 3;</code>
     */
    public Builder setEmailIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      emailId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userPassword_ = "";
    /**
     * <code>string userPassword = 4;</code>
     */
    public java.lang.String getUserPassword() {
      java.lang.Object ref = userPassword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userPassword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userPassword = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUserPasswordBytes() {
      java.lang.Object ref = userPassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userPassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userPassword = 4;</code>
     */
    public Builder setUserPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userPassword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userPassword = 4;</code>
     */
    public Builder clearUserPassword() {
      
      userPassword_ = getDefaultInstance().getUserPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string userPassword = 4;</code>
     */
    public Builder setUserPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userPassword_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userRole_ = "";
    /**
     * <code>string userRole = 5;</code>
     */
    public java.lang.String getUserRole() {
      java.lang.Object ref = userRole_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userRole_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userRole = 5;</code>
     */
    public com.google.protobuf.ByteString
        getUserRoleBytes() {
      java.lang.Object ref = userRole_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userRole_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userRole = 5;</code>
     */
    public Builder setUserRole(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userRole_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userRole = 5;</code>
     */
    public Builder clearUserRole() {
      
      userRole_ = getDefaultInstance().getUserRole();
      onChanged();
      return this;
    }
    /**
     * <code>string userRole = 5;</code>
     */
    public Builder setUserRoleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userRole_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object techStack_ = "";
    /**
     * <code>string techStack = 6;</code>
     */
    public java.lang.String getTechStack() {
      java.lang.Object ref = techStack_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        techStack_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string techStack = 6;</code>
     */
    public com.google.protobuf.ByteString
        getTechStackBytes() {
      java.lang.Object ref = techStack_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        techStack_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string techStack = 6;</code>
     */
    public Builder setTechStack(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      techStack_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string techStack = 6;</code>
     */
    public Builder clearTechStack() {
      
      techStack_ = getDefaultInstance().getTechStack();
      onChanged();
      return this;
    }
    /**
     * <code>string techStack = 6;</code>
     */
    public Builder setTechStackBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      techStack_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jobRole_ = "";
    /**
     * <code>string jobRole = 7;</code>
     */
    public java.lang.String getJobRole() {
      java.lang.Object ref = jobRole_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobRole_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jobRole = 7;</code>
     */
    public com.google.protobuf.ByteString
        getJobRoleBytes() {
      java.lang.Object ref = jobRole_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobRole_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jobRole = 7;</code>
     */
    public Builder setJobRole(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobRole_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jobRole = 7;</code>
     */
    public Builder clearJobRole() {
      
      jobRole_ = getDefaultInstance().getJobRole();
      onChanged();
      return this;
    }
    /**
     * <code>string jobRole = 7;</code>
     */
    public Builder setJobRoleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobRole_ = value;
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


    // @@protoc_insertion_point(builder_scope:registration.userProfile)
  }

  // @@protoc_insertion_point(class_scope:registration.userProfile)
  private static final com.gl.grpc.userProfile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gl.grpc.userProfile();
  }

  public static com.gl.grpc.userProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<userProfile>
      PARSER = new com.google.protobuf.AbstractParser<userProfile>() {
    @java.lang.Override
    public userProfile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new userProfile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<userProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<userProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gl.grpc.userProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

