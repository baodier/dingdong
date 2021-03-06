package thrift;/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

public class LuquResultStudent implements org.apache.thrift.TBase<LuquResultStudent, LuquResultStudent._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LuquResultStudent");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SCHOOL_FIELD_DESC = new org.apache.thrift.protocol.TField("school", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DEPARTMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("department", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LuquResultStudentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LuquResultStudentTupleSchemeFactory());
  }

  public int status; // required
  public String school; // required
  public String department; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    SCHOOL((short)2, "school"),
    DEPARTMENT((short)3, "department");

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
        case 1: // STATUS
          return STATUS;
        case 2: // SCHOOL
          return SCHOOL;
        case 3: // DEPARTMENT
          return DEPARTMENT;
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
  private static final int __STATUS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCHOOL, new org.apache.thrift.meta_data.FieldMetaData("school", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEPARTMENT, new org.apache.thrift.meta_data.FieldMetaData("department", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LuquResultStudent.class, metaDataMap);
  }

  public LuquResultStudent() {
  }

  public LuquResultStudent(
    int status,
    String school,
    String department)
  {
    this();
    this.status = status;
    setStatusIsSet(true);
    this.school = school;
    this.department = department;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LuquResultStudent(LuquResultStudent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.status = other.status;
    if (other.isSetSchool()) {
      this.school = other.school;
    }
    if (other.isSetDepartment()) {
      this.department = other.department;
    }
  }

  public LuquResultStudent deepCopy() {
    return new LuquResultStudent(this);
  }

  @Override
  public void clear() {
    setStatusIsSet(false);
    this.status = 0;
    this.school = null;
    this.department = null;
  }

  public int getStatus() {
    return this.status;
  }

  public LuquResultStudent setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  public String getSchool() {
    return this.school;
  }

  public LuquResultStudent setSchool(String school) {
    this.school = school;
    return this;
  }

  public void unsetSchool() {
    this.school = null;
  }

  /** Returns true if field school is set (has been assigned a value) and false otherwise */
  public boolean isSetSchool() {
    return this.school != null;
  }

  public void setSchoolIsSet(boolean value) {
    if (!value) {
      this.school = null;
    }
  }

  public String getDepartment() {
    return this.department;
  }

  public LuquResultStudent setDepartment(String department) {
    this.department = department;
    return this;
  }

  public void unsetDepartment() {
    this.department = null;
  }

  /** Returns true if field department is set (has been assigned a value) and false otherwise */
  public boolean isSetDepartment() {
    return this.department != null;
  }

  public void setDepartmentIsSet(boolean value) {
    if (!value) {
      this.department = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Integer)value);
      }
      break;

    case SCHOOL:
      if (value == null) {
        unsetSchool();
      } else {
        setSchool((String)value);
      }
      break;

    case DEPARTMENT:
      if (value == null) {
        unsetDepartment();
      } else {
        setDepartment((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return Integer.valueOf(getStatus());

    case SCHOOL:
      return getSchool();

    case DEPARTMENT:
      return getDepartment();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case SCHOOL:
      return isSetSchool();
    case DEPARTMENT:
      return isSetDepartment();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LuquResultStudent)
      return this.equals((LuquResultStudent)that);
    return false;
  }

  public boolean equals(LuquResultStudent that) {
    if (that == null)
      return false;

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_school = true && this.isSetSchool();
    boolean that_present_school = true && that.isSetSchool();
    if (this_present_school || that_present_school) {
      if (!(this_present_school && that_present_school))
        return false;
      if (!this.school.equals(that.school))
        return false;
    }

    boolean this_present_department = true && this.isSetDepartment();
    boolean that_present_department = true && that.isSetDepartment();
    if (this_present_department || that_present_department) {
      if (!(this_present_department && that_present_department))
        return false;
      if (!this.department.equals(that.department))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LuquResultStudent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LuquResultStudent typedOther = (LuquResultStudent)other;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSchool()).compareTo(typedOther.isSetSchool());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchool()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.school, typedOther.school);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepartment()).compareTo(typedOther.isSetDepartment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepartment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.department, typedOther.department);
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
    StringBuilder sb = new StringBuilder("LuquResultStudent(");
    boolean first = true;

    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("school:");
    if (this.school == null) {
      sb.append("null");
    } else {
      sb.append(this.school);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("department:");
    if (this.department == null) {
      sb.append("null");
    } else {
      sb.append(this.department);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LuquResultStudentStandardSchemeFactory implements SchemeFactory {
    public LuquResultStudentStandardScheme getScheme() {
      return new LuquResultStudentStandardScheme();
    }
  }

  private static class LuquResultStudentStandardScheme extends StandardScheme<LuquResultStudent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LuquResultStudent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCHOOL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.school = iprot.readString();
              struct.setSchoolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEPARTMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.department = iprot.readString();
              struct.setDepartmentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LuquResultStudent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(struct.status);
      oprot.writeFieldEnd();
      if (struct.school != null) {
        oprot.writeFieldBegin(SCHOOL_FIELD_DESC);
        oprot.writeString(struct.school);
        oprot.writeFieldEnd();
      }
      if (struct.department != null) {
        oprot.writeFieldBegin(DEPARTMENT_FIELD_DESC);
        oprot.writeString(struct.department);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LuquResultStudentTupleSchemeFactory implements SchemeFactory {
    public LuquResultStudentTupleScheme getScheme() {
      return new LuquResultStudentTupleScheme();
    }
  }

  private static class LuquResultStudentTupleScheme extends TupleScheme<LuquResultStudent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LuquResultStudent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetSchool()) {
        optionals.set(1);
      }
      if (struct.isSetDepartment()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status);
      }
      if (struct.isSetSchool()) {
        oprot.writeString(struct.school);
      }
      if (struct.isSetDepartment()) {
        oprot.writeString(struct.department);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LuquResultStudent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = iprot.readI32();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.school = iprot.readString();
        struct.setSchoolIsSet(true);
      }
      if (incoming.get(2)) {
        struct.department = iprot.readString();
        struct.setDepartmentIsSet(true);
      }
    }
  }

}

