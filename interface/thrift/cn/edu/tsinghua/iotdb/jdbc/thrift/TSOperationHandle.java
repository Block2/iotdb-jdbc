/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.edu.tsinghua.iotdb.jdbc.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TSOperationHandle implements org.apache.thrift.TBase<TSOperationHandle, TSOperationHandle._Fields>, java.io.Serializable, Cloneable, Comparable<TSOperationHandle> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSOperationHandle");

  private static final org.apache.thrift.protocol.TField OPERATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operationId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_RESULT_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("hasResultSet", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSOperationHandleStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSOperationHandleTupleSchemeFactory());
  }

  public TSHandleIdentifier operationId; // required
  public boolean hasResultSet; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATION_ID((short)1, "operationId"),
    HAS_RESULT_SET((short)2, "hasResultSet");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OPERATION_ID
          return OPERATION_ID;
        case 2: // HAS_RESULT_SET
          return HAS_RESULT_SET;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HASRESULTSET_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATION_ID, new org.apache.thrift.meta_data.FieldMetaData("operationId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSHandleIdentifier.class)));
    tmpMap.put(_Fields.HAS_RESULT_SET, new org.apache.thrift.meta_data.FieldMetaData("hasResultSet", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSOperationHandle.class, metaDataMap);
  }

  public TSOperationHandle() {
  }

  public TSOperationHandle(
    TSHandleIdentifier operationId,
    boolean hasResultSet)
  {
    this();
    this.operationId = operationId;
    this.hasResultSet = hasResultSet;
    setHasResultSetIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSOperationHandle(TSOperationHandle other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOperationId()) {
      this.operationId = new TSHandleIdentifier(other.operationId);
    }
    this.hasResultSet = other.hasResultSet;
  }

  public TSOperationHandle deepCopy() {
    return new TSOperationHandle(this);
  }

  @Override
  public void clear() {
    this.operationId = null;
    setHasResultSetIsSet(false);
    this.hasResultSet = false;
  }

  public TSHandleIdentifier getOperationId() {
    return this.operationId;
  }

  public TSOperationHandle setOperationId(TSHandleIdentifier operationId) {
    this.operationId = operationId;
    return this;
  }

  public void unsetOperationId() {
    this.operationId = null;
  }

  /** Returns true if field operationId is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationId() {
    return this.operationId != null;
  }

  public void setOperationIdIsSet(boolean value) {
    if (!value) {
      this.operationId = null;
    }
  }

  public boolean isHasResultSet() {
    return this.hasResultSet;
  }

  public TSOperationHandle setHasResultSet(boolean hasResultSet) {
    this.hasResultSet = hasResultSet;
    setHasResultSetIsSet(true);
    return this;
  }

  public void unsetHasResultSet() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HASRESULTSET_ISSET_ID);
  }

  /** Returns true if field hasResultSet is set (has been assigned a value) and false otherwise */
  public boolean isSetHasResultSet() {
    return EncodingUtils.testBit(__isset_bitfield, __HASRESULTSET_ISSET_ID);
  }

  public void setHasResultSetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HASRESULTSET_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATION_ID:
      if (value == null) {
        unsetOperationId();
      } else {
        setOperationId((TSHandleIdentifier)value);
      }
      break;

    case HAS_RESULT_SET:
      if (value == null) {
        unsetHasResultSet();
      } else {
        setHasResultSet((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATION_ID:
      return getOperationId();

    case HAS_RESULT_SET:
      return Boolean.valueOf(isHasResultSet());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATION_ID:
      return isSetOperationId();
    case HAS_RESULT_SET:
      return isSetHasResultSet();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSOperationHandle)
      return this.equals((TSOperationHandle)that);
    return false;
  }

  public boolean equals(TSOperationHandle that) {
    if (that == null)
      return false;

    boolean this_present_operationId = true && this.isSetOperationId();
    boolean that_present_operationId = true && that.isSetOperationId();
    if (this_present_operationId || that_present_operationId) {
      if (!(this_present_operationId && that_present_operationId))
        return false;
      if (!this.operationId.equals(that.operationId))
        return false;
    }

    boolean this_present_hasResultSet = true;
    boolean that_present_hasResultSet = true;
    if (this_present_hasResultSet || that_present_hasResultSet) {
      if (!(this_present_hasResultSet && that_present_hasResultSet))
        return false;
      if (this.hasResultSet != that.hasResultSet)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TSOperationHandle other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOperationId()).compareTo(other.isSetOperationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationId, other.operationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHasResultSet()).compareTo(other.isSetHasResultSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasResultSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasResultSet, other.hasResultSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TSOperationHandle(");
    boolean first = true;

    sb.append("operationId:");
    if (this.operationId == null) {
      sb.append("null");
    } else {
      sb.append(this.operationId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasResultSet:");
    sb.append(this.hasResultSet);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (operationId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'operationId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'hasResultSet' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (operationId != null) {
      operationId.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSOperationHandleStandardSchemeFactory implements SchemeFactory {
    public TSOperationHandleStandardScheme getScheme() {
      return new TSOperationHandleStandardScheme();
    }
  }

  private static class TSOperationHandleStandardScheme extends StandardScheme<TSOperationHandle> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSOperationHandle struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.operationId = new TSHandleIdentifier();
              struct.operationId.read(iprot);
              struct.setOperationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_RESULT_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasResultSet = iprot.readBool();
              struct.setHasResultSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetHasResultSet()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'hasResultSet' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSOperationHandle struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operationId != null) {
        oprot.writeFieldBegin(OPERATION_ID_FIELD_DESC);
        struct.operationId.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_RESULT_SET_FIELD_DESC);
      oprot.writeBool(struct.hasResultSet);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSOperationHandleTupleSchemeFactory implements SchemeFactory {
    public TSOperationHandleTupleScheme getScheme() {
      return new TSOperationHandleTupleScheme();
    }
  }

  private static class TSOperationHandleTupleScheme extends TupleScheme<TSOperationHandle> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSOperationHandle struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.operationId.write(oprot);
      oprot.writeBool(struct.hasResultSet);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSOperationHandle struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.operationId = new TSHandleIdentifier();
      struct.operationId.read(iprot);
      struct.setOperationIdIsSet(true);
      struct.hasResultSet = iprot.readBool();
      struct.setHasResultSetIsSet(true);
    }
  }

}

