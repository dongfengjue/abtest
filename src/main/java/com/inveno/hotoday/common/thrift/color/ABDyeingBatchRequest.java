/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.inveno.hotoday.common.thrift.color;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-05")
public class ABDyeingBatchRequest implements org.apache.thrift.TBase<ABDyeingBatchRequest, ABDyeingBatchRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ABDyeingBatchRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ABDyeingBatchRequest");

  private static final org.apache.thrift.protocol.TField _UID_REQ_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("_uid_req_infos", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ABDyeingBatchRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ABDyeingBatchRequestTupleSchemeFactory());
  }

  public List<ABDyeingUidReqInfo> _uid_req_infos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    _UID_REQ_INFOS((short)1, "_uid_req_infos");

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
        case 1: // _UID_REQ_INFOS
          return _UID_REQ_INFOS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields._UID_REQ_INFOS, new org.apache.thrift.meta_data.FieldMetaData("_uid_req_infos", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ABDyeingUidReqInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ABDyeingBatchRequest.class, metaDataMap);
  }

  public ABDyeingBatchRequest() {
  }

  public ABDyeingBatchRequest(
    List<ABDyeingUidReqInfo> _uid_req_infos)
  {
    this();
    this._uid_req_infos = _uid_req_infos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ABDyeingBatchRequest(ABDyeingBatchRequest other) {
    if (other.isSet_uid_req_infos()) {
      List<ABDyeingUidReqInfo> __this___uid_req_infos = new ArrayList<ABDyeingUidReqInfo>(other._uid_req_infos.size());
      for (ABDyeingUidReqInfo other_element : other._uid_req_infos) {
        __this___uid_req_infos.add(new ABDyeingUidReqInfo(other_element));
      }
      this._uid_req_infos = __this___uid_req_infos;
    }
  }

  public ABDyeingBatchRequest deepCopy() {
    return new ABDyeingBatchRequest(this);
  }

  @Override
  public void clear() {
    this._uid_req_infos = null;
  }

  public int get_uid_req_infosSize() {
    return (this._uid_req_infos == null) ? 0 : this._uid_req_infos.size();
  }

  public java.util.Iterator<ABDyeingUidReqInfo> get_uid_req_infosIterator() {
    return (this._uid_req_infos == null) ? null : this._uid_req_infos.iterator();
  }

  public void addTo_uid_req_infos(ABDyeingUidReqInfo elem) {
    if (this._uid_req_infos == null) {
      this._uid_req_infos = new ArrayList<ABDyeingUidReqInfo>();
    }
    this._uid_req_infos.add(elem);
  }

  public List<ABDyeingUidReqInfo> get_uid_req_infos() {
    return this._uid_req_infos;
  }

  public ABDyeingBatchRequest set_uid_req_infos(List<ABDyeingUidReqInfo> _uid_req_infos) {
    this._uid_req_infos = _uid_req_infos;
    return this;
  }

  public void unset_uid_req_infos() {
    this._uid_req_infos = null;
  }

  /** Returns true if field _uid_req_infos is set (has been assigned a value) and false otherwise */
  public boolean isSet_uid_req_infos() {
    return this._uid_req_infos != null;
  }

  public void set_uid_req_infosIsSet(boolean value) {
    if (!value) {
      this._uid_req_infos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case _UID_REQ_INFOS:
      if (value == null) {
        unset_uid_req_infos();
      } else {
        set_uid_req_infos((List<ABDyeingUidReqInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case _UID_REQ_INFOS:
      return get_uid_req_infos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case _UID_REQ_INFOS:
      return isSet_uid_req_infos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ABDyeingBatchRequest)
      return this.equals((ABDyeingBatchRequest)that);
    return false;
  }

  public boolean equals(ABDyeingBatchRequest that) {
    if (that == null)
      return false;

    boolean this_present__uid_req_infos = true && this.isSet_uid_req_infos();
    boolean that_present__uid_req_infos = true && that.isSet_uid_req_infos();
    if (this_present__uid_req_infos || that_present__uid_req_infos) {
      if (!(this_present__uid_req_infos && that_present__uid_req_infos))
        return false;
      if (!this._uid_req_infos.equals(that._uid_req_infos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present__uid_req_infos = true && (isSet_uid_req_infos());
    list.add(present__uid_req_infos);
    if (present__uid_req_infos)
      list.add(_uid_req_infos);

    return list.hashCode();
  }

  @Override
  public int compareTo(ABDyeingBatchRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSet_uid_req_infos()).compareTo(other.isSet_uid_req_infos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_uid_req_infos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._uid_req_infos, other._uid_req_infos);
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
    StringBuilder sb = new StringBuilder("ABDyeingBatchRequest(");
    boolean first = true;

    sb.append("_uid_req_infos:");
    if (this._uid_req_infos == null) {
      sb.append("null");
    } else {
      sb.append(this._uid_req_infos);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (_uid_req_infos == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field '_uid_req_infos' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ABDyeingBatchRequestStandardSchemeFactory implements SchemeFactory {
    public ABDyeingBatchRequestStandardScheme getScheme() {
      return new ABDyeingBatchRequestStandardScheme();
    }
  }

  private static class ABDyeingBatchRequestStandardScheme extends StandardScheme<ABDyeingBatchRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ABDyeingBatchRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // _UID_REQ_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct._uid_req_infos = new ArrayList<ABDyeingUidReqInfo>(_list8.size);
                ABDyeingUidReqInfo _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new ABDyeingUidReqInfo();
                  _elem9.read(iprot);
                  struct._uid_req_infos.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.set_uid_req_infosIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ABDyeingBatchRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct._uid_req_infos != null) {
        oprot.writeFieldBegin(_UID_REQ_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct._uid_req_infos.size()));
          for (ABDyeingUidReqInfo _iter11 : struct._uid_req_infos)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ABDyeingBatchRequestTupleSchemeFactory implements SchemeFactory {
    public ABDyeingBatchRequestTupleScheme getScheme() {
      return new ABDyeingBatchRequestTupleScheme();
    }
  }

  private static class ABDyeingBatchRequestTupleScheme extends TupleScheme<ABDyeingBatchRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ABDyeingBatchRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct._uid_req_infos.size());
        for (ABDyeingUidReqInfo _iter12 : struct._uid_req_infos)
        {
          _iter12.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ABDyeingBatchRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct._uid_req_infos = new ArrayList<ABDyeingUidReqInfo>(_list13.size);
        ABDyeingUidReqInfo _elem14;
        for (int _i15 = 0; _i15 < _list13.size; ++_i15)
        {
          _elem14 = new ABDyeingUidReqInfo();
          _elem14.read(iprot);
          struct._uid_req_infos.add(_elem14);
        }
      }
      struct.set_uid_req_infosIsSet(true);
    }
  }

}
