
package com.info.types;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DeliveryAddress extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5628348551213908391L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeliveryAddress\",\"namespace\":\"guru.learningjournal.kafka.examples.types\",\"fields\":[{\"name\":\"AddressLine\",\"type\":[\"null\",\"string\"]},{\"name\":\"City\",\"type\":[\"null\",\"string\"]},{\"name\":\"State\",\"type\":[\"null\",\"string\"]},{\"name\":\"PinCode\",\"type\":[\"null\",\"string\"]},{\"name\":\"ContactNumber\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence AddressLine;
  @Deprecated public java.lang.CharSequence City;
  @Deprecated public java.lang.CharSequence State;
  @Deprecated public java.lang.CharSequence PinCode;
  @Deprecated public java.lang.CharSequence ContactNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DeliveryAddress() {}

  /**
   * All-args constructor.
   * @param AddressLine The new value for AddressLine
   * @param City The new value for City
   * @param State The new value for State
   * @param PinCode The new value for PinCode
   * @param ContactNumber The new value for ContactNumber
   */
  public DeliveryAddress(java.lang.CharSequence AddressLine, java.lang.CharSequence City, java.lang.CharSequence State, java.lang.CharSequence PinCode, java.lang.CharSequence ContactNumber) {
    this.AddressLine = AddressLine;
    this.City = City;
    this.State = State;
    this.PinCode = PinCode;
    this.ContactNumber = ContactNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return AddressLine;
    case 1: return City;
    case 2: return State;
    case 3: return PinCode;
    case 4: return ContactNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: AddressLine = (java.lang.CharSequence)value$; break;
    case 1: City = (java.lang.CharSequence)value$; break;
    case 2: State = (java.lang.CharSequence)value$; break;
    case 3: PinCode = (java.lang.CharSequence)value$; break;
    case 4: ContactNumber = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'AddressLine' field.
   * @return The value of the 'AddressLine' field.
   */
  public java.lang.CharSequence getAddressLine() {
    return AddressLine;
  }

  /**
   * Sets the value of the 'AddressLine' field.
   * @param value the value to set.
   */
  public void setAddressLine(java.lang.CharSequence value) {
    this.AddressLine = value;
  }

  /**
   * Gets the value of the 'City' field.
   * @return The value of the 'City' field.
   */
  public java.lang.CharSequence getCity() {
    return City;
  }

  /**
   * Sets the value of the 'City' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.City = value;
  }

  /**
   * Gets the value of the 'State' field.
   * @return The value of the 'State' field.
   */
  public java.lang.CharSequence getState() {
    return State;
  }

  /**
   * Sets the value of the 'State' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.State = value;
  }

  /**
   * Gets the value of the 'PinCode' field.
   * @return The value of the 'PinCode' field.
   */
  public java.lang.CharSequence getPinCode() {
    return PinCode;
  }

  /**
   * Sets the value of the 'PinCode' field.
   * @param value the value to set.
   */
  public void setPinCode(java.lang.CharSequence value) {
    this.PinCode = value;
  }

  /**
   * Gets the value of the 'ContactNumber' field.
   * @return The value of the 'ContactNumber' field.
   */
  public java.lang.CharSequence getContactNumber() {
    return ContactNumber;
  }

  /**
   * Sets the value of the 'ContactNumber' field.
   * @param value the value to set.
   */
  public void setContactNumber(java.lang.CharSequence value) {
    this.ContactNumber = value;
  }

  /**
   * Creates a new DeliveryAddress RecordBuilder.
   * @return A new DeliveryAddress RecordBuilder
   */
  public static DeliveryAddress.Builder newBuilder() {
    return new DeliveryAddress.Builder();
  }

  /**
   * Creates a new DeliveryAddress RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DeliveryAddress RecordBuilder
   */
  public static DeliveryAddress.Builder newBuilder(DeliveryAddress.Builder other) {
    return new DeliveryAddress.Builder(other);
  }

  /**
   * Creates a new DeliveryAddress RecordBuilder by copying an existing DeliveryAddress instance.
   * @param other The existing instance to copy.
   * @return A new DeliveryAddress RecordBuilder
   */
  public static DeliveryAddress.Builder newBuilder(DeliveryAddress other) {
    return new DeliveryAddress.Builder(other);
  }

  /**
   * RecordBuilder for DeliveryAddress instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DeliveryAddress>
    implements org.apache.avro.data.RecordBuilder<DeliveryAddress> {

    private java.lang.CharSequence AddressLine;
    private java.lang.CharSequence City;
    private java.lang.CharSequence State;
    private java.lang.CharSequence PinCode;
    private java.lang.CharSequence ContactNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(DeliveryAddress.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.AddressLine)) {
        this.AddressLine = data().deepCopy(fields()[0].schema(), other.AddressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.City)) {
        this.City = data().deepCopy(fields()[1].schema(), other.City);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.State)) {
        this.State = data().deepCopy(fields()[2].schema(), other.State);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.PinCode)) {
        this.PinCode = data().deepCopy(fields()[3].schema(), other.PinCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ContactNumber)) {
        this.ContactNumber = data().deepCopy(fields()[4].schema(), other.ContactNumber);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DeliveryAddress instance
     * @param other The existing instance to copy.
     */
    private Builder(DeliveryAddress other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.AddressLine)) {
        this.AddressLine = data().deepCopy(fields()[0].schema(), other.AddressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.City)) {
        this.City = data().deepCopy(fields()[1].schema(), other.City);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.State)) {
        this.State = data().deepCopy(fields()[2].schema(), other.State);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.PinCode)) {
        this.PinCode = data().deepCopy(fields()[3].schema(), other.PinCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ContactNumber)) {
        this.ContactNumber = data().deepCopy(fields()[4].schema(), other.ContactNumber);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'AddressLine' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddressLine() {
      return AddressLine;
    }

    /**
      * Sets the value of the 'AddressLine' field.
      * @param value The value of 'AddressLine'.
      * @return This builder.
      */
    public DeliveryAddress.Builder setAddressLine(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.AddressLine = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'AddressLine' field has been set.
      * @return True if the 'AddressLine' field has been set, false otherwise.
      */
    public boolean hasAddressLine() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'AddressLine' field.
      * @return This builder.
      */
    public DeliveryAddress.Builder clearAddressLine() {
      AddressLine = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'City' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return City;
    }

    /**
      * Sets the value of the 'City' field.
      * @param value The value of 'City'.
      * @return This builder.
      */
    public DeliveryAddress.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.City = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'City' field has been set.
      * @return True if the 'City' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'City' field.
      * @return This builder.
      */
    public DeliveryAddress.Builder clearCity() {
      City = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'State' field.
      * @return The value.
      */
    public java.lang.CharSequence getState() {
      return State;
    }

    /**
      * Sets the value of the 'State' field.
      * @param value The value of 'State'.
      * @return This builder.
      */
    public DeliveryAddress.Builder setState(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.State = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'State' field has been set.
      * @return True if the 'State' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'State' field.
      * @return This builder.
      */
    public DeliveryAddress.Builder clearState() {
      State = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'PinCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getPinCode() {
      return PinCode;
    }

    /**
      * Sets the value of the 'PinCode' field.
      * @param value The value of 'PinCode'.
      * @return This builder.
      */
    public DeliveryAddress.Builder setPinCode(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.PinCode = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'PinCode' field has been set.
      * @return True if the 'PinCode' field has been set, false otherwise.
      */
    public boolean hasPinCode() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'PinCode' field.
      * @return This builder.
      */
    public DeliveryAddress.Builder clearPinCode() {
      PinCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'ContactNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactNumber() {
      return ContactNumber;
    }

    /**
      * Sets the value of the 'ContactNumber' field.
      * @param value The value of 'ContactNumber'.
      * @return This builder.
      */
    public DeliveryAddress.Builder setContactNumber(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.ContactNumber = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'ContactNumber' field has been set.
      * @return True if the 'ContactNumber' field has been set, false otherwise.
      */
    public boolean hasContactNumber() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'ContactNumber' field.
      * @return This builder.
      */
    public DeliveryAddress.Builder clearContactNumber() {
      ContactNumber = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public DeliveryAddress build() {
      try {
        DeliveryAddress record = new DeliveryAddress();
        record.AddressLine = fieldSetFlags()[0] ? this.AddressLine : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.City = fieldSetFlags()[1] ? this.City : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.State = fieldSetFlags()[2] ? this.State : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.PinCode = fieldSetFlags()[3] ? this.PinCode : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.ContactNumber = fieldSetFlags()[4] ? this.ContactNumber : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
