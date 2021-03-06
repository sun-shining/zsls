/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.pbccrc.zsls.api.thrift.records;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-1-7")
public class HeartBeatResponse implements org.apache.thrift.TBase<HeartBeatResponse, HeartBeatResponse._Fields>, java.io.Serializable, Cloneable, Comparable<HeartBeatResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartBeatResponse");

  private static final org.apache.thrift.protocol.TField NODE_ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeAction", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CLUSTER_FIELD_DESC = new org.apache.thrift.protocol.TField("cluster", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HeartBeatResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HeartBeatResponseTupleSchemeFactory());
  }

  /**
   * 
   * @see NodeAction
   */
  public NodeAction nodeAction; // required
  public TCluster cluster; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see NodeAction
     */
    NODE_ACTION((short)1, "nodeAction"),
    CLUSTER((short)2, "cluster");

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
        case 1: // NODE_ACTION
          return NODE_ACTION;
        case 2: // CLUSTER
          return CLUSTER;
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
  private static final _Fields optionals[] = {_Fields.CLUSTER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_ACTION, new org.apache.thrift.meta_data.FieldMetaData("nodeAction", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, NodeAction.class)));
    tmpMap.put(_Fields.CLUSTER, new org.apache.thrift.meta_data.FieldMetaData("cluster", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCluster.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartBeatResponse.class, metaDataMap);
  }

  public HeartBeatResponse() {
  }

  public HeartBeatResponse(
    NodeAction nodeAction)
  {
    this();
    this.nodeAction = nodeAction;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartBeatResponse(HeartBeatResponse other) {
    if (other.isSetNodeAction()) {
      this.nodeAction = other.nodeAction;
    }
    if (other.isSetCluster()) {
      this.cluster = new TCluster(other.cluster);
    }
  }

  public HeartBeatResponse deepCopy() {
    return new HeartBeatResponse(this);
  }

  @Override
  public void clear() {
    this.nodeAction = null;
    this.cluster = null;
  }

  /**
   * 
   * @see NodeAction
   */
  public NodeAction getNodeAction() {
    return this.nodeAction;
  }

  /**
   * 
   * @see NodeAction
   */
  public HeartBeatResponse setNodeAction(NodeAction nodeAction) {
    this.nodeAction = nodeAction;
    return this;
  }

  public void unsetNodeAction() {
    this.nodeAction = null;
  }

  /** Returns true if field nodeAction is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeAction() {
    return this.nodeAction != null;
  }

  public void setNodeActionIsSet(boolean value) {
    if (!value) {
      this.nodeAction = null;
    }
  }

  public TCluster getCluster() {
    return this.cluster;
  }

  public HeartBeatResponse setCluster(TCluster cluster) {
    this.cluster = cluster;
    return this;
  }

  public void unsetCluster() {
    this.cluster = null;
  }

  /** Returns true if field cluster is set (has been assigned a value) and false otherwise */
  public boolean isSetCluster() {
    return this.cluster != null;
  }

  public void setClusterIsSet(boolean value) {
    if (!value) {
      this.cluster = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODE_ACTION:
      if (value == null) {
        unsetNodeAction();
      } else {
        setNodeAction((NodeAction)value);
      }
      break;

    case CLUSTER:
      if (value == null) {
        unsetCluster();
      } else {
        setCluster((TCluster)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_ACTION:
      return getNodeAction();

    case CLUSTER:
      return getCluster();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODE_ACTION:
      return isSetNodeAction();
    case CLUSTER:
      return isSetCluster();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HeartBeatResponse)
      return this.equals((HeartBeatResponse)that);
    return false;
  }

  public boolean equals(HeartBeatResponse that) {
    if (that == null)
      return false;

    boolean this_present_nodeAction = true && this.isSetNodeAction();
    boolean that_present_nodeAction = true && that.isSetNodeAction();
    if (this_present_nodeAction || that_present_nodeAction) {
      if (!(this_present_nodeAction && that_present_nodeAction))
        return false;
      if (!this.nodeAction.equals(that.nodeAction))
        return false;
    }

    boolean this_present_cluster = true && this.isSetCluster();
    boolean that_present_cluster = true && that.isSetCluster();
    if (this_present_cluster || that_present_cluster) {
      if (!(this_present_cluster && that_present_cluster))
        return false;
      if (!this.cluster.equals(that.cluster))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nodeAction = true && (isSetNodeAction());
    list.add(present_nodeAction);
    if (present_nodeAction)
      list.add(nodeAction.getValue());

    boolean present_cluster = true && (isSetCluster());
    list.add(present_cluster);
    if (present_cluster)
      list.add(cluster);

    return list.hashCode();
  }

  @Override
  public int compareTo(HeartBeatResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNodeAction()).compareTo(other.isSetNodeAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeAction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeAction, other.nodeAction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCluster()).compareTo(other.isSetCluster());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCluster()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cluster, other.cluster);
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
    StringBuilder sb = new StringBuilder("HeartBeatResponse(");
    boolean first = true;

    sb.append("nodeAction:");
    if (this.nodeAction == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeAction);
    }
    first = false;
    if (isSetCluster()) {
      if (!first) sb.append(", ");
      sb.append("cluster:");
      if (this.cluster == null) {
        sb.append("null");
      } else {
        sb.append(this.cluster);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (nodeAction == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodeAction' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (cluster != null) {
      cluster.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HeartBeatResponseStandardSchemeFactory implements SchemeFactory {
    public HeartBeatResponseStandardScheme getScheme() {
      return new HeartBeatResponseStandardScheme();
    }
  }

  private static class HeartBeatResponseStandardScheme extends StandardScheme<HeartBeatResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HeartBeatResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE_ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nodeAction = org.pbccrc.zsls.api.thrift.records.NodeAction.findByValue(iprot.readI32());
              struct.setNodeActionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLUSTER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cluster = new TCluster();
              struct.cluster.read(iprot);
              struct.setClusterIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HeartBeatResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodeAction != null) {
        oprot.writeFieldBegin(NODE_ACTION_FIELD_DESC);
        oprot.writeI32(struct.nodeAction.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.cluster != null) {
        if (struct.isSetCluster()) {
          oprot.writeFieldBegin(CLUSTER_FIELD_DESC);
          struct.cluster.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeartBeatResponseTupleSchemeFactory implements SchemeFactory {
    public HeartBeatResponseTupleScheme getScheme() {
      return new HeartBeatResponseTupleScheme();
    }
  }

  private static class HeartBeatResponseTupleScheme extends TupleScheme<HeartBeatResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HeartBeatResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.nodeAction.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetCluster()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCluster()) {
        struct.cluster.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HeartBeatResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.nodeAction = org.pbccrc.zsls.api.thrift.records.NodeAction.findByValue(iprot.readI32());
      struct.setNodeActionIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.cluster = new TCluster();
        struct.cluster.read(iprot);
        struct.setClusterIsSet(true);
      }
    }
  }

}

