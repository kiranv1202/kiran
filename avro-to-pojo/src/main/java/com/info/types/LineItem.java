
package com.info.types;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LineItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4678327854019892713L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LineItem\",\"namespace\":\"guru.learningjournal.kafka.examples.types\",\"fields\":[{\"name\":\"ItemCode\",\"type\":[\"null\",\"string\"]},{\"name\":\"ItemDescription\",\"type\":[\"null\",\"string\"]},{\"name\":\"ItemPrice\",\"type\":[\"null\",\"double\"]},{\"name\":\"ItemQty\",\"type\":[\"null\",\"int\"]},{\"name\":\"TotalValue\",\"type\":[\"null\",\"double\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence ItemCode;
  @Deprecated public java.lang.CharSequence ItemDescription;
  @Deprecated public java.lang.Double ItemPrice;
  @Deprecated public java.lang.Integer ItemQty;
  @Deprecated public java.lang.Double TotalValue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LineItem() {}

  /**
   * All-args constructor.
   * @param ItemCode The new value for ItemCode
   * @param ItemDescription The new value for ItemDescription
   * @param ItemPrice The new value for ItemPrice
   * @param ItemQty The new value for ItemQty
   * @param TotalValue The new value for TotalValue
   */
  public LineItem(java.lang.CharSequence ItemCode, java.lang.CharSequence ItemDescription, java.lang.Double ItemPrice, java.lang.Integer ItemQty, java.lang.Double TotalValue) {
    this.ItemCode = ItemCode;
    this.ItemDescription = ItemDescription;
    this.ItemPrice = ItemPrice;
    this.ItemQty = ItemQty;
    this.TotalValue = TotalValue;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ItemCode;
    case 1: return ItemDescription;
    case 2: return ItemPrice;
    case 3: return ItemQty;
    case 4: return TotalValue;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ItemCode = (java.lang.CharSequence)value$; break;
    case 1: ItemDescription = (java.lang.CharSequence)value$; break;
    case 2: ItemPrice = (java.lang.Double)value$; break;
    case 3: ItemQty = (java.lang.Integer)value$; break;
    case 4: TotalValue = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ItemCode' field.
   * @return The value of the 'ItemCode' field.
   */
  public java.lang.CharSequence getItemCode() {
    return ItemCode;
  }

  /**
   * Sets the value of the 'ItemCode' field.
   * @param value the value to set.
   */
  public void setItemCode(java.lang.CharSequence value) {
    this.ItemCode = value;
  }

  /**
   * Gets the value of the 'ItemDescription' field.
   * @return The value of the 'ItemDescription' field.
   */
  public java.lang.CharSequence getItemDescription() {
    return ItemDescription;
  }

  /**
   * Sets the value of the 'ItemDescription' field.
   * @param value the value to set.
   */
  public void setItemDescription(java.lang.CharSequence value) {
    this.ItemDescription = value;
  }

  /**
   * Gets the value of the 'ItemPrice' field.
   * @return The value of the 'ItemPrice' field.
   */
  public java.lang.Double getItemPrice() {
    return ItemPrice;
  }

  /**
   * Sets the value of the 'ItemPrice' field.
   * @param value the value to set.
   */
  public void setItemPrice(java.lang.Double value) {
    this.ItemPrice = value;
  }

  /**
   * Gets the value of the 'ItemQty' field.
   * @return The value of the 'ItemQty' field.
   */
  public java.lang.Integer getItemQty() {
    return ItemQty;
  }

  /**
   * Sets the value of the 'ItemQty' field.
   * @param value the value to set.
   */
  public void setItemQty(java.lang.Integer value) {
    this.ItemQty = value;
  }

  /**
   * Gets the value of the 'TotalValue' field.
   * @return The value of the 'TotalValue' field.
   */
  public java.lang.Double getTotalValue() {
    return TotalValue;
  }

  /**
   * Sets the value of the 'TotalValue' field.
   * @param value the value to set.
   */
  public void setTotalValue(java.lang.Double value) {
    this.TotalValue = value;
  }

  /**
   * Creates a new LineItem RecordBuilder.
   * @return A new LineItem RecordBuilder
   */
  public static LineItem.Builder newBuilder() {
    return new LineItem.Builder();
  }

  /**
   * Creates a new LineItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LineItem RecordBuilder
   */
  public static LineItem.Builder newBuilder(LineItem.Builder other) {
    return new LineItem.Builder(other);
  }

  /**
   * Creates a new LineItem RecordBuilder by copying an existing LineItem instance.
   * @param other The existing instance to copy.
   * @return A new LineItem RecordBuilder
   */
  public static LineItem.Builder newBuilder(LineItem other) {
    return new LineItem.Builder(other);
  }

  /**
   * RecordBuilder for LineItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LineItem>
    implements org.apache.avro.data.RecordBuilder<LineItem> {

    private java.lang.CharSequence ItemCode;
    private java.lang.CharSequence ItemDescription;
    private java.lang.Double ItemPrice;
    private java.lang.Integer ItemQty;
    private java.lang.Double TotalValue;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(LineItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ItemCode)) {
        this.ItemCode = data().deepCopy(fields()[0].schema(), other.ItemCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ItemDescription)) {
        this.ItemDescription = data().deepCopy(fields()[1].schema(), other.ItemDescription);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ItemPrice)) {
        this.ItemPrice = data().deepCopy(fields()[2].schema(), other.ItemPrice);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ItemQty)) {
        this.ItemQty = data().deepCopy(fields()[3].schema(), other.ItemQty);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.TotalValue)) {
        this.TotalValue = data().deepCopy(fields()[4].schema(), other.TotalValue);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LineItem instance
     * @param other The existing instance to copy.
     */
    private Builder(LineItem other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.ItemCode)) {
        this.ItemCode = data().deepCopy(fields()[0].schema(), other.ItemCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ItemDescription)) {
        this.ItemDescription = data().deepCopy(fields()[1].schema(), other.ItemDescription);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ItemPrice)) {
        this.ItemPrice = data().deepCopy(fields()[2].schema(), other.ItemPrice);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ItemQty)) {
        this.ItemQty = data().deepCopy(fields()[3].schema(), other.ItemQty);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.TotalValue)) {
        this.TotalValue = data().deepCopy(fields()[4].schema(), other.TotalValue);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'ItemCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getItemCode() {
      return ItemCode;
    }

    /**
      * Sets the value of the 'ItemCode' field.
      * @param value The value of 'ItemCode'.
      * @return This builder.
      */
    public LineItem.Builder setItemCode(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ItemCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ItemCode' field has been set.
      * @return True if the 'ItemCode' field has been set, false otherwise.
      */
    public boolean hasItemCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ItemCode' field.
      * @return This builder.
      */
    public LineItem.Builder clearItemCode() {
      ItemCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ItemDescription' field.
      * @return The value.
      */
    public java.lang.CharSequence getItemDescription() {
      return ItemDescription;
    }

    /**
      * Sets the value of the 'ItemDescription' field.
      * @param value The value of 'ItemDescription'.
      * @return This builder.
      */
    public LineItem.Builder setItemDescription(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ItemDescription = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ItemDescription' field has been set.
      * @return True if the 'ItemDescription' field has been set, false otherwise.
      */
    public boolean hasItemDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ItemDescription' field.
      * @return This builder.
      */
    public LineItem.Builder clearItemDescription() {
      ItemDescription = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ItemPrice' field.
      * @return The value.
      */
    public java.lang.Double getItemPrice() {
      return ItemPrice;
    }

    /**
      * Sets the value of the 'ItemPrice' field.
      * @param value The value of 'ItemPrice'.
      * @return This builder.
      */
    public LineItem.Builder setItemPrice(java.lang.Double value) {
      validate(fields()[2], value);
      this.ItemPrice = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ItemPrice' field has been set.
      * @return True if the 'ItemPrice' field has been set, false otherwise.
      */
    public boolean hasItemPrice() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ItemPrice' field.
      * @return This builder.
      */
    public LineItem.Builder clearItemPrice() {
      ItemPrice = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ItemQty' field.
      * @return The value.
      */
    public java.lang.Integer getItemQty() {
      return ItemQty;
    }

    /**
      * Sets the value of the 'ItemQty' field.
      * @param value The value of 'ItemQty'.
      * @return This builder.
      */
    public LineItem.Builder setItemQty(java.lang.Integer value) {
      validate(fields()[3], value);
      this.ItemQty = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ItemQty' field has been set.
      * @return True if the 'ItemQty' field has been set, false otherwise.
      */
    public boolean hasItemQty() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ItemQty' field.
      * @return This builder.
      */
    public LineItem.Builder clearItemQty() {
      ItemQty = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'TotalValue' field.
      * @return The value.
      */
    public java.lang.Double getTotalValue() {
      return TotalValue;
    }

    /**
      * Sets the value of the 'TotalValue' field.
      * @param value The value of 'TotalValue'.
      * @return This builder.
      */
    public LineItem.Builder setTotalValue(java.lang.Double value) {
      validate(fields()[4], value);
      this.TotalValue = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'TotalValue' field has been set.
      * @return True if the 'TotalValue' field has been set, false otherwise.
      */
    public boolean hasTotalValue() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'TotalValue' field.
      * @return This builder.
      */
    public LineItem.Builder clearTotalValue() {
      TotalValue = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public LineItem build() {
      try {
        LineItem record = new LineItem();
        record.ItemCode = fieldSetFlags()[0] ? this.ItemCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ItemDescription = fieldSetFlags()[1] ? this.ItemDescription : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ItemPrice = fieldSetFlags()[2] ? this.ItemPrice : (java.lang.Double) defaultValue(fields()[2]);
        record.ItemQty = fieldSetFlags()[3] ? this.ItemQty : (java.lang.Integer) defaultValue(fields()[3]);
        record.TotalValue = fieldSetFlags()[4] ? this.TotalValue : (java.lang.Double) defaultValue(fields()[4]);
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
