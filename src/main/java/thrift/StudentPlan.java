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

public class StudentPlan implements org.apache.thrift.TBase<StudentPlan, StudentPlan._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StudentPlan");

  private static final org.apache.thrift.protocol.TField PROVINCE_FIELD_DESC = new org.apache.thrift.protocol.TField("province", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SCHOOL_FIELD_DESC = new org.apache.thrift.protocol.TField("school", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MAJOR_FIELD_DESC = new org.apache.thrift.protocol.TField("major", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ADJUST_FIELD_DESC = new org.apache.thrift.protocol.TField("adjust", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StudentPlanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StudentPlanTupleSchemeFactory());
  }

  public String province; // required
  public String school; // required
  public List<String> major; // required
  public boolean adjust; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROVINCE((short)1, "province"),
    SCHOOL((short)2, "school"),
    MAJOR((short)3, "major"),
    ADJUST((short)4, "adjust");

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
        case 1: // PROVINCE
          return PROVINCE;
        case 2: // SCHOOL
          return SCHOOL;
        case 3: // MAJOR
          return MAJOR;
        case 4: // ADJUST
          return ADJUST;
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
  private static final int __ADJUST_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROVINCE, new org.apache.thrift.meta_data.FieldMetaData("province", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCHOOL, new org.apache.thrift.meta_data.FieldMetaData("school", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAJOR, new org.apache.thrift.meta_data.FieldMetaData("major", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ADJUST, new org.apache.thrift.meta_data.FieldMetaData("adjust", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StudentPlan.class, metaDataMap);
  }

  public StudentPlan() {
  }

  public StudentPlan(
    String province,
    String school,
    List<String> major,
    boolean adjust)
  {
    this();
    this.province = province;
    this.school = school;
    this.major = major;
    this.adjust = adjust;
    setAdjustIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StudentPlan(StudentPlan other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProvince()) {
      this.province = other.province;
    }
    if (other.isSetSchool()) {
      this.school = other.school;
    }
    if (other.isSetMajor()) {
      List<String> __this__major = new ArrayList<String>();
      for (String other_element : other.major) {
        __this__major.add(other_element);
      }
      this.major = __this__major;
    }
    this.adjust = other.adjust;
  }

  public StudentPlan deepCopy() {
    return new StudentPlan(this);
  }

  @Override
  public void clear() {
    this.province = null;
    this.school = null;
    this.major = null;
    setAdjustIsSet(false);
    this.adjust = false;
  }

  public String getProvince() {
    return this.province;
  }

  public StudentPlan setProvince(String province) {
    this.province = province;
    return this;
  }

  public void unsetProvince() {
    this.province = null;
  }

  /** Returns true if field province is set (has been assigned a value) and false otherwise */
  public boolean isSetProvince() {
    return this.province != null;
  }

  public void setProvinceIsSet(boolean value) {
    if (!value) {
      this.province = null;
    }
  }

  public String getSchool() {
    return this.school;
  }

  public StudentPlan setSchool(String school) {
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

  public int getMajorSize() {
    return (this.major == null) ? 0 : this.major.size();
  }

  public java.util.Iterator<String> getMajorIterator() {
    return (this.major == null) ? null : this.major.iterator();
  }

  public void addToMajor(String elem) {
    if (this.major == null) {
      this.major = new ArrayList<String>();
    }
    this.major.add(elem);
  }

  public List<String> getMajor() {
    return this.major;
  }

  public StudentPlan setMajor(List<String> major) {
    this.major = major;
    return this;
  }

  public void unsetMajor() {
    this.major = null;
  }

  /** Returns true if field major is set (has been assigned a value) and false otherwise */
  public boolean isSetMajor() {
    return this.major != null;
  }

  public void setMajorIsSet(boolean value) {
    if (!value) {
      this.major = null;
    }
  }

  public boolean isAdjust() {
    return this.adjust;
  }

  public StudentPlan setAdjust(boolean adjust) {
    this.adjust = adjust;
    setAdjustIsSet(true);
    return this;
  }

  public void unsetAdjust() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ADJUST_ISSET_ID);
  }

  /** Returns true if field adjust is set (has been assigned a value) and false otherwise */
  public boolean isSetAdjust() {
    return EncodingUtils.testBit(__isset_bitfield, __ADJUST_ISSET_ID);
  }

  public void setAdjustIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ADJUST_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROVINCE:
      if (value == null) {
        unsetProvince();
      } else {
        setProvince((String)value);
      }
      break;

    case SCHOOL:
      if (value == null) {
        unsetSchool();
      } else {
        setSchool((String)value);
      }
      break;

    case MAJOR:
      if (value == null) {
        unsetMajor();
      } else {
        setMajor((List<String>)value);
      }
      break;

    case ADJUST:
      if (value == null) {
        unsetAdjust();
      } else {
        setAdjust((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROVINCE:
      return getProvince();

    case SCHOOL:
      return getSchool();

    case MAJOR:
      return getMajor();

    case ADJUST:
      return Boolean.valueOf(isAdjust());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROVINCE:
      return isSetProvince();
    case SCHOOL:
      return isSetSchool();
    case MAJOR:
      return isSetMajor();
    case ADJUST:
      return isSetAdjust();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StudentPlan)
      return this.equals((StudentPlan)that);
    return false;
  }

  public boolean equals(StudentPlan that) {
    if (that == null)
      return false;

    boolean this_present_province = true && this.isSetProvince();
    boolean that_present_province = true && that.isSetProvince();
    if (this_present_province || that_present_province) {
      if (!(this_present_province && that_present_province))
        return false;
      if (!this.province.equals(that.province))
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

    boolean this_present_major = true && this.isSetMajor();
    boolean that_present_major = true && that.isSetMajor();
    if (this_present_major || that_present_major) {
      if (!(this_present_major && that_present_major))
        return false;
      if (!this.major.equals(that.major))
        return false;
    }

    boolean this_present_adjust = true;
    boolean that_present_adjust = true;
    if (this_present_adjust || that_present_adjust) {
      if (!(this_present_adjust && that_present_adjust))
        return false;
      if (this.adjust != that.adjust)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(StudentPlan other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    StudentPlan typedOther = (StudentPlan)other;

    lastComparison = Boolean.valueOf(isSetProvince()).compareTo(typedOther.isSetProvince());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProvince()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.province, typedOther.province);
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
    lastComparison = Boolean.valueOf(isSetMajor()).compareTo(typedOther.isSetMajor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMajor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.major, typedOther.major);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdjust()).compareTo(typedOther.isSetAdjust());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdjust()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adjust, typedOther.adjust);
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
    StringBuilder sb = new StringBuilder("StudentPlan(");
    boolean first = true;

    sb.append("province:");
    if (this.province == null) {
      sb.append("null");
    } else {
      sb.append(this.province);
    }
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
    sb.append("major:");
    if (this.major == null) {
      sb.append("null");
    } else {
      sb.append(this.major);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("adjust:");
    sb.append(this.adjust);
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

  private static class StudentPlanStandardSchemeFactory implements SchemeFactory {
    public StudentPlanStandardScheme getScheme() {
      return new StudentPlanStandardScheme();
    }
  }

  private static class StudentPlanStandardScheme extends StandardScheme<StudentPlan> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StudentPlan struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROVINCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.province = iprot.readString();
              struct.setProvinceIsSet(true);
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
          case 3: // MAJOR
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.major = new ArrayList<String>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  String _elem2; // required
                  _elem2 = iprot.readString();
                  struct.major.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setMajorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ADJUST
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.adjust = iprot.readBool();
              struct.setAdjustIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StudentPlan struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.province != null) {
        oprot.writeFieldBegin(PROVINCE_FIELD_DESC);
        oprot.writeString(struct.province);
        oprot.writeFieldEnd();
      }
      if (struct.school != null) {
        oprot.writeFieldBegin(SCHOOL_FIELD_DESC);
        oprot.writeString(struct.school);
        oprot.writeFieldEnd();
      }
      if (struct.major != null) {
        oprot.writeFieldBegin(MAJOR_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.major.size()));
          for (String _iter3 : struct.major)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ADJUST_FIELD_DESC);
      oprot.writeBool(struct.adjust);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StudentPlanTupleSchemeFactory implements SchemeFactory {
    public StudentPlanTupleScheme getScheme() {
      return new StudentPlanTupleScheme();
    }
  }

  private static class StudentPlanTupleScheme extends TupleScheme<StudentPlan> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StudentPlan struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProvince()) {
        optionals.set(0);
      }
      if (struct.isSetSchool()) {
        optionals.set(1);
      }
      if (struct.isSetMajor()) {
        optionals.set(2);
      }
      if (struct.isSetAdjust()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetProvince()) {
        oprot.writeString(struct.province);
      }
      if (struct.isSetSchool()) {
        oprot.writeString(struct.school);
      }
      if (struct.isSetMajor()) {
        {
          oprot.writeI32(struct.major.size());
          for (String _iter4 : struct.major)
          {
            oprot.writeString(_iter4);
          }
        }
      }
      if (struct.isSetAdjust()) {
        oprot.writeBool(struct.adjust);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StudentPlan struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.province = iprot.readString();
        struct.setProvinceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.school = iprot.readString();
        struct.setSchoolIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.major = new ArrayList<String>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            String _elem7; // required
            _elem7 = iprot.readString();
            struct.major.add(_elem7);
          }
        }
        struct.setMajorIsSet(true);
      }
      if (incoming.get(3)) {
        struct.adjust = iprot.readBool();
        struct.setAdjustIsSet(true);
      }
    }
  }

}

