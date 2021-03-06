/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.sdnplatform.sync.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-06-16")
public class KeyedVersions implements org.apache.thrift.TBase<KeyedVersions, KeyedVersions._Fields>, java.io.Serializable, Cloneable, Comparable<KeyedVersions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("KeyedVersions");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("versions", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new KeyedVersionsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new KeyedVersionsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer key; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<VectorClock> versions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    VERSIONS((short)2, "versions");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEY
          return KEY;
        case 2: // VERSIONS
          return VERSIONS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("versions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, VectorClock.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KeyedVersions.class, metaDataMap);
  }

  public KeyedVersions() {
  }

  public KeyedVersions(
    java.nio.ByteBuffer key,
    java.util.List<VectorClock> versions)
  {
    this();
    this.key = org.apache.thrift.TBaseHelper.copyBinary(key);
    this.versions = versions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeyedVersions(KeyedVersions other) {
    if (other.isSetKey()) {
      this.key = org.apache.thrift.TBaseHelper.copyBinary(other.key);
    }
    if (other.isSetVersions()) {
      java.util.List<VectorClock> __this__versions = new java.util.ArrayList<VectorClock>(other.versions.size());
      for (VectorClock other_element : other.versions) {
        __this__versions.add(new VectorClock(other_element));
      }
      this.versions = __this__versions;
    }
  }

  public KeyedVersions deepCopy() {
    return new KeyedVersions(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.versions = null;
  }

  public byte[] getKey() {
    setKey(org.apache.thrift.TBaseHelper.rightSize(key));
    return key == null ? null : key.array();
  }

  public java.nio.ByteBuffer bufferForKey() {
    return org.apache.thrift.TBaseHelper.copyBinary(key);
  }

  public KeyedVersions setKey(byte[] key) {
    this.key = key == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(key.clone());
    return this;
  }

  public KeyedVersions setKey(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer key) {
    this.key = org.apache.thrift.TBaseHelper.copyBinary(key);
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public int getVersionsSize() {
    return (this.versions == null) ? 0 : this.versions.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<VectorClock> getVersionsIterator() {
    return (this.versions == null) ? null : this.versions.iterator();
  }

  public void addToVersions(VectorClock elem) {
    if (this.versions == null) {
      this.versions = new java.util.ArrayList<VectorClock>();
    }
    this.versions.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<VectorClock> getVersions() {
    return this.versions;
  }

  public KeyedVersions setVersions(@org.apache.thrift.annotation.Nullable java.util.List<VectorClock> versions) {
    this.versions = versions;
    return this;
  }

  public void unsetVersions() {
    this.versions = null;
  }

  /** Returns true if field versions is set (has been assigned a value) and false otherwise */
  public boolean isSetVersions() {
    return this.versions != null;
  }

  public void setVersionsIsSet(boolean value) {
    if (!value) {
      this.versions = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        if (value instanceof byte[]) {
          setKey((byte[])value);
        } else {
          setKey((java.nio.ByteBuffer)value);
        }
      }
      break;

    case VERSIONS:
      if (value == null) {
        unsetVersions();
      } else {
        setVersions((java.util.List<VectorClock>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case VERSIONS:
      return getVersions();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case VERSIONS:
      return isSetVersions();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof KeyedVersions)
      return this.equals((KeyedVersions)that);
    return false;
  }

  public boolean equals(KeyedVersions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_versions = true && this.isSetVersions();
    boolean that_present_versions = true && that.isSetVersions();
    if (this_present_versions || that_present_versions) {
      if (!(this_present_versions && that_present_versions))
        return false;
      if (!this.versions.equals(that.versions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
    if (isSetKey())
      hashCode = hashCode * 8191 + key.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersions()) ? 131071 : 524287);
    if (isSetVersions())
      hashCode = hashCode * 8191 + versions.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(KeyedVersions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersions()).compareTo(other.isSetVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versions, other.versions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyedVersions(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.key, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("versions:");
    if (this.versions == null) {
      sb.append("null");
    } else {
      sb.append(this.versions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (key == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'key' was not present! Struct: " + toString());
    }
    if (versions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'versions' was not present! Struct: " + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class KeyedVersionsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeyedVersionsStandardScheme getScheme() {
      return new KeyedVersionsStandardScheme();
    }
  }

  private static class KeyedVersionsStandardScheme extends org.apache.thrift.scheme.StandardScheme<KeyedVersions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, KeyedVersions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readBinary();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.versions = new java.util.ArrayList<VectorClock>(_list16.size);
                @org.apache.thrift.annotation.Nullable VectorClock _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new VectorClock();
                  _elem17.read(iprot);
                  struct.versions.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setVersionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, KeyedVersions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeBinary(struct.key);
        oprot.writeFieldEnd();
      }
      if (struct.versions != null) {
        oprot.writeFieldBegin(VERSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.versions.size()));
          for (VectorClock _iter19 : struct.versions)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeyedVersionsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeyedVersionsTupleScheme getScheme() {
      return new KeyedVersionsTupleScheme();
    }
  }

  private static class KeyedVersionsTupleScheme extends org.apache.thrift.scheme.TupleScheme<KeyedVersions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, KeyedVersions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBinary(struct.key);
      {
        oprot.writeI32(struct.versions.size());
        for (VectorClock _iter20 : struct.versions)
        {
          _iter20.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, KeyedVersions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.key = iprot.readBinary();
      struct.setKeyIsSet(true);
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.versions = new java.util.ArrayList<VectorClock>(_list21.size);
        @org.apache.thrift.annotation.Nullable VectorClock _elem22;
        for (int _i23 = 0; _i23 < _list21.size; ++_i23)
        {
          _elem22 = new VectorClock();
          _elem22.read(iprot);
          struct.versions.add(_elem22);
        }
      }
      struct.setVersionsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

