// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InterviewerSlot.proto

package com.GLProduct.interviewer;

public final class InterviewerSlotOuterClass {
  private InterviewerSlotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InterviewerSlot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InterviewerSlot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Slot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Slot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_APIRESPONSE_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_APIRESPONSE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseSlot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseSlot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetSlotById_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetSlotById_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slotsByDate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_slotsByDate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slotDeletion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_slotDeletion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slotUpdationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_slotUpdationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SlotUpdation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SlotUpdation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_updateSlot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_updateSlot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025InterviewerSlot.proto\"[\n\017InterviewerSl" +
      "ot\022\032\n\022interviewerEmailId\030\001 \001(\t\022\027\n\017interv" +
      "iewerName\030\002 \001(\t\022\023\n\004slot\030\003 \003(\0132\005.Slot\"L\n\004" +
      "Slot\022\014\n\004date\030\001 \001(\t\022\021\n\tstartTime\030\002 \001(\t\022\017\n" +
      "\007endTime\030\003 \001(\t\022\022\n\nslotStatus\030\004 \001(\t\"z\n\013AP" +
      "IRESPONSE\022\022\n\nbookingMsg\030\005 \001(\t\022\030\n\020intervi" +
      "ewEmailId\030\006 \001(\t\022\027\n\017interviewerName\030\007 \001(\t" +
      "\022$\n\rresponse_slot\030\010 \003(\0132\r.ResponseSlot\"i" +
      "\n\014ResponseSlot\022\016\n\006slotId\030\n \001(\005\022\021\n\tslot_d" +
      "ate\030\013 \001(\t\022\022\n\nslotStatus\030\016 \001(\t\022\021\n\tstartTi" +
      "me\030\014 \001(\t\022\017\n\007endTime\030\r \001(\t\")\n\013GetSlotById" +
      "\022\032\n\022interviewerEmailId\030\001 \001(\t\";\n\013slotsByD" +
      "ate\022\020\n\010slotDate\030\001 \001(\t\022\032\n\022interviewerEmai" +
      "lId\030\002 \001(\t\"\036\n\014slotDeletion\022\016\n\006slotId\030\001 \001(" +
      "\005\"\201\001\n\024slotUpdationResponse\022\017\n\007message\030\001 " +
      "\001(\t\022\027\n\017interviewerName\030\002 \001(\t\022\032\n\022intervie" +
      "werEmailId\030\003 \001(\t\022#\n\014responseSlot\030\004 \001(\0132\r" +
      ".ResponseSlot\"<\n\014SlotUpdation\022\017\n\007slot_id" +
      "\030\001 \001(\005\022\033\n\023updated_slot_status\030\002 \001(\t\"p\n\nu" +
      "pdateSlot\022\017\n\007slot_id\030\001 \001(\005\022\021\n\tslot_date\030" +
      "\002 \001(\t\022\027\n\017slot_start_time\030\003 \001(\t\022\025\n\rslot_e" +
      "nd_time\030\004 \001(\t\022\016\n\006status\030\005 \001(\t2\332\002\n\022Interv" +
      "iewerService\0222\n\020newInterviewSlot\022\020.Inter" +
      "viewerSlot\032\014.APIRESPONSE\0225\n\024getAllSlotsB" +
      "yEmailId\022\014.GetSlotById\032\r.ResponseSlot0\001\022" +
      "2\n\021getAllSlotsByDate\022\014.slotsByDate\032\r.Res" +
      "ponseSlot0\001\0222\n\ndeleteSlot\022\r.slotDeletion" +
      "\032\025.slotUpdationResponse\0228\n\020updateSlotSta" +
      "tus\022\r.SlotUpdation\032\025.slotUpdationRespons" +
      "e\0227\n\021updateSlotRequest\022\013.updateSlot\032\025.sl" +
      "otUpdationResponseB\035\n\031com.GLProduct.inte" +
      "rviewerP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InterviewerSlot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InterviewerSlot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InterviewerSlot_descriptor,
        new java.lang.String[] { "InterviewerEmailId", "InterviewerName", "Slot", });
    internal_static_Slot_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Slot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Slot_descriptor,
        new java.lang.String[] { "Date", "StartTime", "EndTime", "SlotStatus", });
    internal_static_APIRESPONSE_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_APIRESPONSE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_APIRESPONSE_descriptor,
        new java.lang.String[] { "BookingMsg", "InterviewEmailId", "InterviewerName", "ResponseSlot", });
    internal_static_ResponseSlot_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ResponseSlot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseSlot_descriptor,
        new java.lang.String[] { "SlotId", "SlotDate", "SlotStatus", "StartTime", "EndTime", });
    internal_static_GetSlotById_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetSlotById_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetSlotById_descriptor,
        new java.lang.String[] { "InterviewerEmailId", });
    internal_static_slotsByDate_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_slotsByDate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_slotsByDate_descriptor,
        new java.lang.String[] { "SlotDate", "InterviewerEmailId", });
    internal_static_slotDeletion_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_slotDeletion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_slotDeletion_descriptor,
        new java.lang.String[] { "SlotId", });
    internal_static_slotUpdationResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_slotUpdationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_slotUpdationResponse_descriptor,
        new java.lang.String[] { "Message", "InterviewerName", "InterviewerEmailId", "ResponseSlot", });
    internal_static_SlotUpdation_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_SlotUpdation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SlotUpdation_descriptor,
        new java.lang.String[] { "SlotId", "UpdatedSlotStatus", });
    internal_static_updateSlot_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_updateSlot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_updateSlot_descriptor,
        new java.lang.String[] { "SlotId", "SlotDate", "SlotStartTime", "SlotEndTime", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
