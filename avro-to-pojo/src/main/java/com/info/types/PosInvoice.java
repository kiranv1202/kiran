
package com.info.types;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PosInvoice extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2743919655764826879L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PosInvoice\",\"namespace\":\"guru.learningjournal.kafka.examples.types\",\"fields\":[{\"name\":\"InvoiceNumber\",\"type\":[\"null\",\"string\"]},{\"name\":\"CreatedTime\",\"type\":[\"null\",\"long\"]},{\"name\":\"CustomerCardNo\",\"type\":[\"null\",\"double\"]},{\"name\":\"TotalAmount\",\"type\":[\"null\",\"double\"]},{\"name\":\"NumberOfItems\",\"type\":[\"null\",\"int\"]},{\"name\":\"PaymentMethod\",\"type\":[\"null\",\"string\"]},{\"name\":\"TaxableAmount\",\"type\":[\"null\",\"double\"]},{\"name\":\"CGST\",\"type\":[\"null\",\"double\"]},{\"name\":\"SGST\",\"type\":[\"null\",\"double\"]},{\"name\":\"CESS\",\"type\":[\"null\",\"double\"]},{\"name\":\"StoreID\",\"type\":[\"null\",\"string\"]},{\"name\":\"PosID\",\"type\":[\"null\",\"string\"]},{\"name\":\"CashierID\",\"type\":[\"null\",\"string\"]},{\"name\":\"CustomerType\",\"type\":[\"null\",\"string\"]},{\"name\":\"DeliveryType\",\"type\":[\"null\",\"string\"]},{\"name\":\"DeliveryAddress\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DeliveryAddress\",\"fields\":[{\"name\":\"AddressLine\",\"type\":[\"null\",\"string\"]},{\"name\":\"City\",\"type\":[\"null\",\"string\"]},{\"name\":\"State\",\"type\":[\"null\",\"string\"]},{\"name\":\"PinCode\",\"type\":[\"null\",\"string\"]},{\"name\":\"ContactNumber\",\"type\":[\"null\",\"string\"]}]}]},{\"name\":\"InvoiceLineItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LineItem\",\"fields\":[{\"name\":\"ItemCode\",\"type\":[\"null\",\"string\"]},{\"name\":\"ItemDescription\",\"type\":[\"null\",\"string\"]},{\"name\":\"ItemPrice\",\"type\":[\"null\",\"double\"]},{\"name\":\"ItemQty\",\"type\":[\"null\",\"int\"]},{\"name\":\"TotalValue\",\"type\":[\"null\",\"double\"]}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence InvoiceNumber;
  @Deprecated public java.lang.Long CreatedTime;
  @Deprecated public java.lang.Double CustomerCardNo;
  @Deprecated public java.lang.Double TotalAmount;
  @Deprecated public java.lang.Integer NumberOfItems;
  @Deprecated public java.lang.CharSequence PaymentMethod;
  @Deprecated public java.lang.Double TaxableAmount;
  @Deprecated public java.lang.Double CGST;
  @Deprecated public java.lang.Double SGST;
  @Deprecated public java.lang.Double CESS;
  @Deprecated public java.lang.CharSequence StoreID;
  @Deprecated public java.lang.CharSequence PosID;
  @Deprecated public java.lang.CharSequence CashierID;
  @Deprecated public java.lang.CharSequence CustomerType;
  @Deprecated public java.lang.CharSequence DeliveryType;
  @Deprecated public com.info.types.DeliveryAddress DeliveryAddress;
  @Deprecated public java.util.List<LineItem> InvoiceLineItems;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PosInvoice() {}

  /**
   * All-args constructor.
   * @param InvoiceNumber The new value for InvoiceNumber
   * @param CreatedTime The new value for CreatedTime
   * @param CustomerCardNo The new value for CustomerCardNo
   * @param TotalAmount The new value for TotalAmount
   * @param NumberOfItems The new value for NumberOfItems
   * @param PaymentMethod The new value for PaymentMethod
   * @param TaxableAmount The new value for TaxableAmount
   * @param CGST The new value for CGST
   * @param SGST The new value for SGST
   * @param CESS The new value for CESS
   * @param StoreID The new value for StoreID
   * @param PosID The new value for PosID
   * @param CashierID The new value for CashierID
   * @param CustomerType The new value for CustomerType
   * @param DeliveryType The new value for DeliveryType
   * @param DeliveryAddress The new value for DeliveryAddress
   * @param InvoiceLineItems The new value for InvoiceLineItems
   */
  public PosInvoice(java.lang.CharSequence InvoiceNumber, java.lang.Long CreatedTime, java.lang.Double CustomerCardNo, java.lang.Double TotalAmount, java.lang.Integer NumberOfItems, java.lang.CharSequence PaymentMethod, java.lang.Double TaxableAmount, java.lang.Double CGST, java.lang.Double SGST, java.lang.Double CESS, java.lang.CharSequence StoreID, java.lang.CharSequence PosID, java.lang.CharSequence CashierID, java.lang.CharSequence CustomerType, java.lang.CharSequence DeliveryType, com.info.types.DeliveryAddress DeliveryAddress, java.util.List<LineItem> InvoiceLineItems) {
    this.InvoiceNumber = InvoiceNumber;
    this.CreatedTime = CreatedTime;
    this.CustomerCardNo = CustomerCardNo;
    this.TotalAmount = TotalAmount;
    this.NumberOfItems = NumberOfItems;
    this.PaymentMethod = PaymentMethod;
    this.TaxableAmount = TaxableAmount;
    this.CGST = CGST;
    this.SGST = SGST;
    this.CESS = CESS;
    this.StoreID = StoreID;
    this.PosID = PosID;
    this.CashierID = CashierID;
    this.CustomerType = CustomerType;
    this.DeliveryType = DeliveryType;
    this.DeliveryAddress = DeliveryAddress;
    this.InvoiceLineItems = InvoiceLineItems;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return InvoiceNumber;
    case 1: return CreatedTime;
    case 2: return CustomerCardNo;
    case 3: return TotalAmount;
    case 4: return NumberOfItems;
    case 5: return PaymentMethod;
    case 6: return TaxableAmount;
    case 7: return CGST;
    case 8: return SGST;
    case 9: return CESS;
    case 10: return StoreID;
    case 11: return PosID;
    case 12: return CashierID;
    case 13: return CustomerType;
    case 14: return DeliveryType;
    case 15: return DeliveryAddress;
    case 16: return InvoiceLineItems;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: InvoiceNumber = (java.lang.CharSequence)value$; break;
    case 1: CreatedTime = (java.lang.Long)value$; break;
    case 2: CustomerCardNo = (java.lang.Double)value$; break;
    case 3: TotalAmount = (java.lang.Double)value$; break;
    case 4: NumberOfItems = (java.lang.Integer)value$; break;
    case 5: PaymentMethod = (java.lang.CharSequence)value$; break;
    case 6: TaxableAmount = (java.lang.Double)value$; break;
    case 7: CGST = (java.lang.Double)value$; break;
    case 8: SGST = (java.lang.Double)value$; break;
    case 9: CESS = (java.lang.Double)value$; break;
    case 10: StoreID = (java.lang.CharSequence)value$; break;
    case 11: PosID = (java.lang.CharSequence)value$; break;
    case 12: CashierID = (java.lang.CharSequence)value$; break;
    case 13: CustomerType = (java.lang.CharSequence)value$; break;
    case 14: DeliveryType = (java.lang.CharSequence)value$; break;
    case 15: DeliveryAddress = (com.info.types.DeliveryAddress)value$; break;
    case 16: InvoiceLineItems = (java.util.List<LineItem>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'InvoiceNumber' field.
   * @return The value of the 'InvoiceNumber' field.
   */
  public java.lang.CharSequence getInvoiceNumber() {
    return InvoiceNumber;
  }

  /**
   * Sets the value of the 'InvoiceNumber' field.
   * @param value the value to set.
   */
  public void setInvoiceNumber(java.lang.CharSequence value) {
    this.InvoiceNumber = value;
  }

  /**
   * Gets the value of the 'CreatedTime' field.
   * @return The value of the 'CreatedTime' field.
   */
  public java.lang.Long getCreatedTime() {
    return CreatedTime;
  }

  /**
   * Sets the value of the 'CreatedTime' field.
   * @param value the value to set.
   */
  public void setCreatedTime(java.lang.Long value) {
    this.CreatedTime = value;
  }

  /**
   * Gets the value of the 'CustomerCardNo' field.
   * @return The value of the 'CustomerCardNo' field.
   */
  public java.lang.Double getCustomerCardNo() {
    return CustomerCardNo;
  }

  /**
   * Sets the value of the 'CustomerCardNo' field.
   * @param value the value to set.
   */
  public void setCustomerCardNo(java.lang.Double value) {
    this.CustomerCardNo = value;
  }

  /**
   * Gets the value of the 'TotalAmount' field.
   * @return The value of the 'TotalAmount' field.
   */
  public java.lang.Double getTotalAmount() {
    return TotalAmount;
  }

  /**
   * Sets the value of the 'TotalAmount' field.
   * @param value the value to set.
   */
  public void setTotalAmount(java.lang.Double value) {
    this.TotalAmount = value;
  }

  /**
   * Gets the value of the 'NumberOfItems' field.
   * @return The value of the 'NumberOfItems' field.
   */
  public java.lang.Integer getNumberOfItems() {
    return NumberOfItems;
  }

  /**
   * Sets the value of the 'NumberOfItems' field.
   * @param value the value to set.
   */
  public void setNumberOfItems(java.lang.Integer value) {
    this.NumberOfItems = value;
  }

  /**
   * Gets the value of the 'PaymentMethod' field.
   * @return The value of the 'PaymentMethod' field.
   */
  public java.lang.CharSequence getPaymentMethod() {
    return PaymentMethod;
  }

  /**
   * Sets the value of the 'PaymentMethod' field.
   * @param value the value to set.
   */
  public void setPaymentMethod(java.lang.CharSequence value) {
    this.PaymentMethod = value;
  }

  /**
   * Gets the value of the 'TaxableAmount' field.
   * @return The value of the 'TaxableAmount' field.
   */
  public java.lang.Double getTaxableAmount() {
    return TaxableAmount;
  }

  /**
   * Sets the value of the 'TaxableAmount' field.
   * @param value the value to set.
   */
  public void setTaxableAmount(java.lang.Double value) {
    this.TaxableAmount = value;
  }

  /**
   * Gets the value of the 'CGST' field.
   * @return The value of the 'CGST' field.
   */
  public java.lang.Double getCGST() {
    return CGST;
  }

  /**
   * Sets the value of the 'CGST' field.
   * @param value the value to set.
   */
  public void setCGST(java.lang.Double value) {
    this.CGST = value;
  }

  /**
   * Gets the value of the 'SGST' field.
   * @return The value of the 'SGST' field.
   */
  public java.lang.Double getSGST() {
    return SGST;
  }

  /**
   * Sets the value of the 'SGST' field.
   * @param value the value to set.
   */
  public void setSGST(java.lang.Double value) {
    this.SGST = value;
  }

  /**
   * Gets the value of the 'CESS' field.
   * @return The value of the 'CESS' field.
   */
  public java.lang.Double getCESS() {
    return CESS;
  }

  /**
   * Sets the value of the 'CESS' field.
   * @param value the value to set.
   */
  public void setCESS(java.lang.Double value) {
    this.CESS = value;
  }

  /**
   * Gets the value of the 'StoreID' field.
   * @return The value of the 'StoreID' field.
   */
  public java.lang.CharSequence getStoreID() {
    return StoreID;
  }

  /**
   * Sets the value of the 'StoreID' field.
   * @param value the value to set.
   */
  public void setStoreID(java.lang.CharSequence value) {
    this.StoreID = value;
  }

  /**
   * Gets the value of the 'PosID' field.
   * @return The value of the 'PosID' field.
   */
  public java.lang.CharSequence getPosID() {
    return PosID;
  }

  /**
   * Sets the value of the 'PosID' field.
   * @param value the value to set.
   */
  public void setPosID(java.lang.CharSequence value) {
    this.PosID = value;
  }

  /**
   * Gets the value of the 'CashierID' field.
   * @return The value of the 'CashierID' field.
   */
  public java.lang.CharSequence getCashierID() {
    return CashierID;
  }

  /**
   * Sets the value of the 'CashierID' field.
   * @param value the value to set.
   */
  public void setCashierID(java.lang.CharSequence value) {
    this.CashierID = value;
  }

  /**
   * Gets the value of the 'CustomerType' field.
   * @return The value of the 'CustomerType' field.
   */
  public java.lang.CharSequence getCustomerType() {
    return CustomerType;
  }

  /**
   * Sets the value of the 'CustomerType' field.
   * @param value the value to set.
   */
  public void setCustomerType(java.lang.CharSequence value) {
    this.CustomerType = value;
  }

  /**
   * Gets the value of the 'DeliveryType' field.
   * @return The value of the 'DeliveryType' field.
   */
  public java.lang.CharSequence getDeliveryType() {
    return DeliveryType;
  }

  /**
   * Sets the value of the 'DeliveryType' field.
   * @param value the value to set.
   */
  public void setDeliveryType(java.lang.CharSequence value) {
    this.DeliveryType = value;
  }

  /**
   * Gets the value of the 'DeliveryAddress' field.
   * @return The value of the 'DeliveryAddress' field.
   */
  public com.info.types.DeliveryAddress getDeliveryAddress() {
    return DeliveryAddress;
  }

  /**
   * Sets the value of the 'DeliveryAddress' field.
   * @param value the value to set.
   */
  public void setDeliveryAddress(com.info.types.DeliveryAddress value) {
    this.DeliveryAddress = value;
  }

  /**
   * Gets the value of the 'InvoiceLineItems' field.
   * @return The value of the 'InvoiceLineItems' field.
   */
  public java.util.List<LineItem> getInvoiceLineItems() {
    return InvoiceLineItems;
  }

  /**
   * Sets the value of the 'InvoiceLineItems' field.
   * @param value the value to set.
   */
  public void setInvoiceLineItems(java.util.List<LineItem> value) {
    this.InvoiceLineItems = value;
  }

  /**
   * Creates a new PosInvoice RecordBuilder.
   * @return A new PosInvoice RecordBuilder
   */
  public static PosInvoice.Builder newBuilder() {
    return new PosInvoice.Builder();
  }

  /**
   * Creates a new PosInvoice RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PosInvoice RecordBuilder
   */
  public static PosInvoice.Builder newBuilder(PosInvoice.Builder other) {
    return new PosInvoice.Builder(other);
  }

  /**
   * Creates a new PosInvoice RecordBuilder by copying an existing PosInvoice instance.
   * @param other The existing instance to copy.
   * @return A new PosInvoice RecordBuilder
   */
  public static PosInvoice.Builder newBuilder(PosInvoice other) {
    return new PosInvoice.Builder(other);
  }

  /**
   * RecordBuilder for PosInvoice instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PosInvoice>
    implements org.apache.avro.data.RecordBuilder<PosInvoice> {

    private java.lang.CharSequence InvoiceNumber;
    private java.lang.Long CreatedTime;
    private java.lang.Double CustomerCardNo;
    private java.lang.Double TotalAmount;
    private java.lang.Integer NumberOfItems;
    private java.lang.CharSequence PaymentMethod;
    private java.lang.Double TaxableAmount;
    private java.lang.Double CGST;
    private java.lang.Double SGST;
    private java.lang.Double CESS;
    private java.lang.CharSequence StoreID;
    private java.lang.CharSequence PosID;
    private java.lang.CharSequence CashierID;
    private java.lang.CharSequence CustomerType;
    private java.lang.CharSequence DeliveryType;
    private com.info.types.DeliveryAddress DeliveryAddress;
    private com.info.types.DeliveryAddress.Builder DeliveryAddressBuilder;
    private java.util.List<LineItem> InvoiceLineItems;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(PosInvoice.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.InvoiceNumber)) {
        this.InvoiceNumber = data().deepCopy(fields()[0].schema(), other.InvoiceNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CreatedTime)) {
        this.CreatedTime = data().deepCopy(fields()[1].schema(), other.CreatedTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CustomerCardNo)) {
        this.CustomerCardNo = data().deepCopy(fields()[2].schema(), other.CustomerCardNo);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.TotalAmount)) {
        this.TotalAmount = data().deepCopy(fields()[3].schema(), other.TotalAmount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.NumberOfItems)) {
        this.NumberOfItems = data().deepCopy(fields()[4].schema(), other.NumberOfItems);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.PaymentMethod)) {
        this.PaymentMethod = data().deepCopy(fields()[5].schema(), other.PaymentMethod);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.TaxableAmount)) {
        this.TaxableAmount = data().deepCopy(fields()[6].schema(), other.TaxableAmount);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.CGST)) {
        this.CGST = data().deepCopy(fields()[7].schema(), other.CGST);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.SGST)) {
        this.SGST = data().deepCopy(fields()[8].schema(), other.SGST);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.CESS)) {
        this.CESS = data().deepCopy(fields()[9].schema(), other.CESS);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.StoreID)) {
        this.StoreID = data().deepCopy(fields()[10].schema(), other.StoreID);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.PosID)) {
        this.PosID = data().deepCopy(fields()[11].schema(), other.PosID);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.CashierID)) {
        this.CashierID = data().deepCopy(fields()[12].schema(), other.CashierID);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.CustomerType)) {
        this.CustomerType = data().deepCopy(fields()[13].schema(), other.CustomerType);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.DeliveryType)) {
        this.DeliveryType = data().deepCopy(fields()[14].schema(), other.DeliveryType);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.DeliveryAddress)) {
        this.DeliveryAddress = data().deepCopy(fields()[15].schema(), other.DeliveryAddress);
        fieldSetFlags()[15] = true;
      }
      if (other.hasDeliveryAddressBuilder()) {
        this.DeliveryAddressBuilder = com.info.types.DeliveryAddress.newBuilder(other.getDeliveryAddressBuilder());
      }
      if (isValidValue(fields()[16], other.InvoiceLineItems)) {
        this.InvoiceLineItems = data().deepCopy(fields()[16].schema(), other.InvoiceLineItems);
        fieldSetFlags()[16] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PosInvoice instance
     * @param other The existing instance to copy.
     */
    private Builder(PosInvoice other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.InvoiceNumber)) {
        this.InvoiceNumber = data().deepCopy(fields()[0].schema(), other.InvoiceNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CreatedTime)) {
        this.CreatedTime = data().deepCopy(fields()[1].schema(), other.CreatedTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CustomerCardNo)) {
        this.CustomerCardNo = data().deepCopy(fields()[2].schema(), other.CustomerCardNo);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.TotalAmount)) {
        this.TotalAmount = data().deepCopy(fields()[3].schema(), other.TotalAmount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.NumberOfItems)) {
        this.NumberOfItems = data().deepCopy(fields()[4].schema(), other.NumberOfItems);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.PaymentMethod)) {
        this.PaymentMethod = data().deepCopy(fields()[5].schema(), other.PaymentMethod);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.TaxableAmount)) {
        this.TaxableAmount = data().deepCopy(fields()[6].schema(), other.TaxableAmount);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.CGST)) {
        this.CGST = data().deepCopy(fields()[7].schema(), other.CGST);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.SGST)) {
        this.SGST = data().deepCopy(fields()[8].schema(), other.SGST);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.CESS)) {
        this.CESS = data().deepCopy(fields()[9].schema(), other.CESS);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.StoreID)) {
        this.StoreID = data().deepCopy(fields()[10].schema(), other.StoreID);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.PosID)) {
        this.PosID = data().deepCopy(fields()[11].schema(), other.PosID);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.CashierID)) {
        this.CashierID = data().deepCopy(fields()[12].schema(), other.CashierID);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.CustomerType)) {
        this.CustomerType = data().deepCopy(fields()[13].schema(), other.CustomerType);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.DeliveryType)) {
        this.DeliveryType = data().deepCopy(fields()[14].schema(), other.DeliveryType);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.DeliveryAddress)) {
        this.DeliveryAddress = data().deepCopy(fields()[15].schema(), other.DeliveryAddress);
        fieldSetFlags()[15] = true;
      }
      this.DeliveryAddressBuilder = null;
      if (isValidValue(fields()[16], other.InvoiceLineItems)) {
        this.InvoiceLineItems = data().deepCopy(fields()[16].schema(), other.InvoiceLineItems);
        fieldSetFlags()[16] = true;
      }
    }

    /**
      * Gets the value of the 'InvoiceNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getInvoiceNumber() {
      return InvoiceNumber;
    }

    /**
      * Sets the value of the 'InvoiceNumber' field.
      * @param value The value of 'InvoiceNumber'.
      * @return This builder.
      */
    public PosInvoice.Builder setInvoiceNumber(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.InvoiceNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'InvoiceNumber' field has been set.
      * @return True if the 'InvoiceNumber' field has been set, false otherwise.
      */
    public boolean hasInvoiceNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'InvoiceNumber' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearInvoiceNumber() {
      InvoiceNumber = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'CreatedTime' field.
      * @return The value.
      */
    public java.lang.Long getCreatedTime() {
      return CreatedTime;
    }

    /**
      * Sets the value of the 'CreatedTime' field.
      * @param value The value of 'CreatedTime'.
      * @return This builder.
      */
    public PosInvoice.Builder setCreatedTime(java.lang.Long value) {
      validate(fields()[1], value);
      this.CreatedTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'CreatedTime' field has been set.
      * @return True if the 'CreatedTime' field has been set, false otherwise.
      */
    public boolean hasCreatedTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'CreatedTime' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearCreatedTime() {
      CreatedTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'CustomerCardNo' field.
      * @return The value.
      */
    public java.lang.Double getCustomerCardNo() {
      return CustomerCardNo;
    }

    /**
      * Sets the value of the 'CustomerCardNo' field.
      * @param value The value of 'CustomerCardNo'.
      * @return This builder.
      */
    public PosInvoice.Builder setCustomerCardNo(java.lang.Double value) {
      validate(fields()[2], value);
      this.CustomerCardNo = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'CustomerCardNo' field has been set.
      * @return True if the 'CustomerCardNo' field has been set, false otherwise.
      */
    public boolean hasCustomerCardNo() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'CustomerCardNo' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearCustomerCardNo() {
      CustomerCardNo = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'TotalAmount' field.
      * @return The value.
      */
    public java.lang.Double getTotalAmount() {
      return TotalAmount;
    }

    /**
      * Sets the value of the 'TotalAmount' field.
      * @param value The value of 'TotalAmount'.
      * @return This builder.
      */
    public PosInvoice.Builder setTotalAmount(java.lang.Double value) {
      validate(fields()[3], value);
      this.TotalAmount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'TotalAmount' field has been set.
      * @return True if the 'TotalAmount' field has been set, false otherwise.
      */
    public boolean hasTotalAmount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'TotalAmount' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearTotalAmount() {
      TotalAmount = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'NumberOfItems' field.
      * @return The value.
      */
    public java.lang.Integer getNumberOfItems() {
      return NumberOfItems;
    }

    /**
      * Sets the value of the 'NumberOfItems' field.
      * @param value The value of 'NumberOfItems'.
      * @return This builder.
      */
    public PosInvoice.Builder setNumberOfItems(java.lang.Integer value) {
      validate(fields()[4], value);
      this.NumberOfItems = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'NumberOfItems' field has been set.
      * @return True if the 'NumberOfItems' field has been set, false otherwise.
      */
    public boolean hasNumberOfItems() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'NumberOfItems' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearNumberOfItems() {
      NumberOfItems = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'PaymentMethod' field.
      * @return The value.
      */
    public java.lang.CharSequence getPaymentMethod() {
      return PaymentMethod;
    }

    /**
      * Sets the value of the 'PaymentMethod' field.
      * @param value The value of 'PaymentMethod'.
      * @return This builder.
      */
    public PosInvoice.Builder setPaymentMethod(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.PaymentMethod = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'PaymentMethod' field has been set.
      * @return True if the 'PaymentMethod' field has been set, false otherwise.
      */
    public boolean hasPaymentMethod() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'PaymentMethod' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearPaymentMethod() {
      PaymentMethod = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'TaxableAmount' field.
      * @return The value.
      */
    public java.lang.Double getTaxableAmount() {
      return TaxableAmount;
    }

    /**
      * Sets the value of the 'TaxableAmount' field.
      * @param value The value of 'TaxableAmount'.
      * @return This builder.
      */
    public PosInvoice.Builder setTaxableAmount(java.lang.Double value) {
      validate(fields()[6], value);
      this.TaxableAmount = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'TaxableAmount' field has been set.
      * @return True if the 'TaxableAmount' field has been set, false otherwise.
      */
    public boolean hasTaxableAmount() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'TaxableAmount' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearTaxableAmount() {
      TaxableAmount = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'CGST' field.
      * @return The value.
      */
    public java.lang.Double getCGST() {
      return CGST;
    }

    /**
      * Sets the value of the 'CGST' field.
      * @param value The value of 'CGST'.
      * @return This builder.
      */
    public PosInvoice.Builder setCGST(java.lang.Double value) {
      validate(fields()[7], value);
      this.CGST = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'CGST' field has been set.
      * @return True if the 'CGST' field has been set, false otherwise.
      */
    public boolean hasCGST() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'CGST' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearCGST() {
      CGST = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'SGST' field.
      * @return The value.
      */
    public java.lang.Double getSGST() {
      return SGST;
    }

    /**
      * Sets the value of the 'SGST' field.
      * @param value The value of 'SGST'.
      * @return This builder.
      */
    public PosInvoice.Builder setSGST(java.lang.Double value) {
      validate(fields()[8], value);
      this.SGST = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'SGST' field has been set.
      * @return True if the 'SGST' field has been set, false otherwise.
      */
    public boolean hasSGST() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'SGST' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearSGST() {
      SGST = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'CESS' field.
      * @return The value.
      */
    public java.lang.Double getCESS() {
      return CESS;
    }

    /**
      * Sets the value of the 'CESS' field.
      * @param value The value of 'CESS'.
      * @return This builder.
      */
    public PosInvoice.Builder setCESS(java.lang.Double value) {
      validate(fields()[9], value);
      this.CESS = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'CESS' field has been set.
      * @return True if the 'CESS' field has been set, false otherwise.
      */
    public boolean hasCESS() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'CESS' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearCESS() {
      CESS = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'StoreID' field.
      * @return The value.
      */
    public java.lang.CharSequence getStoreID() {
      return StoreID;
    }

    /**
      * Sets the value of the 'StoreID' field.
      * @param value The value of 'StoreID'.
      * @return This builder.
      */
    public PosInvoice.Builder setStoreID(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.StoreID = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'StoreID' field has been set.
      * @return True if the 'StoreID' field has been set, false otherwise.
      */
    public boolean hasStoreID() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'StoreID' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearStoreID() {
      StoreID = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'PosID' field.
      * @return The value.
      */
    public java.lang.CharSequence getPosID() {
      return PosID;
    }

    /**
      * Sets the value of the 'PosID' field.
      * @param value The value of 'PosID'.
      * @return This builder.
      */
    public PosInvoice.Builder setPosID(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.PosID = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'PosID' field has been set.
      * @return True if the 'PosID' field has been set, false otherwise.
      */
    public boolean hasPosID() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'PosID' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearPosID() {
      PosID = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'CashierID' field.
      * @return The value.
      */
    public java.lang.CharSequence getCashierID() {
      return CashierID;
    }

    /**
      * Sets the value of the 'CashierID' field.
      * @param value The value of 'CashierID'.
      * @return This builder.
      */
    public PosInvoice.Builder setCashierID(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.CashierID = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'CashierID' field has been set.
      * @return True if the 'CashierID' field has been set, false otherwise.
      */
    public boolean hasCashierID() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'CashierID' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearCashierID() {
      CashierID = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'CustomerType' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustomerType() {
      return CustomerType;
    }

    /**
      * Sets the value of the 'CustomerType' field.
      * @param value The value of 'CustomerType'.
      * @return This builder.
      */
    public PosInvoice.Builder setCustomerType(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.CustomerType = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'CustomerType' field has been set.
      * @return True if the 'CustomerType' field has been set, false otherwise.
      */
    public boolean hasCustomerType() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'CustomerType' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearCustomerType() {
      CustomerType = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /**
      * Gets the value of the 'DeliveryType' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeliveryType() {
      return DeliveryType;
    }

    /**
      * Sets the value of the 'DeliveryType' field.
      * @param value The value of 'DeliveryType'.
      * @return This builder.
      */
    public PosInvoice.Builder setDeliveryType(java.lang.CharSequence value) {
      validate(fields()[14], value);
      this.DeliveryType = value;
      fieldSetFlags()[14] = true;
      return this;
    }

    /**
      * Checks whether the 'DeliveryType' field has been set.
      * @return True if the 'DeliveryType' field has been set, false otherwise.
      */
    public boolean hasDeliveryType() {
      return fieldSetFlags()[14];
    }


    /**
      * Clears the value of the 'DeliveryType' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearDeliveryType() {
      DeliveryType = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    /**
      * Gets the value of the 'DeliveryAddress' field.
      * @return The value.
      */
    public com.info.types.DeliveryAddress getDeliveryAddress() {
      return DeliveryAddress;
    }

    /**
      * Sets the value of the 'DeliveryAddress' field.
      * @param value The value of 'DeliveryAddress'.
      * @return This builder.
      */
    public PosInvoice.Builder setDeliveryAddress(com.info.types.DeliveryAddress value) {
      validate(fields()[15], value);
      this.DeliveryAddressBuilder = null;
      this.DeliveryAddress = value;
      fieldSetFlags()[15] = true;
      return this;
    }

    /**
      * Checks whether the 'DeliveryAddress' field has been set.
      * @return True if the 'DeliveryAddress' field has been set, false otherwise.
      */
    public boolean hasDeliveryAddress() {
      return fieldSetFlags()[15];
    }

    /**
     * Gets the Builder instance for the 'DeliveryAddress' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.info.types.DeliveryAddress.Builder getDeliveryAddressBuilder() {
      if (DeliveryAddressBuilder == null) {
        if (hasDeliveryAddress()) {
          setDeliveryAddressBuilder(com.info.types.DeliveryAddress.newBuilder(DeliveryAddress));
        } else {
          setDeliveryAddressBuilder(com.info.types.DeliveryAddress.newBuilder());
        }
      }
      return DeliveryAddressBuilder;
    }

    /**
     * Sets the Builder instance for the 'DeliveryAddress' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public PosInvoice.Builder setDeliveryAddressBuilder(com.info.types.DeliveryAddress.Builder value) {
      clearDeliveryAddress();
      DeliveryAddressBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'DeliveryAddress' field has an active Builder instance
     * @return True if the 'DeliveryAddress' field has an active Builder instance
     */
    public boolean hasDeliveryAddressBuilder() {
      return DeliveryAddressBuilder != null;
    }

    /**
      * Clears the value of the 'DeliveryAddress' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearDeliveryAddress() {
      DeliveryAddress = null;
      DeliveryAddressBuilder = null;
      fieldSetFlags()[15] = false;
      return this;
    }

    /**
      * Gets the value of the 'InvoiceLineItems' field.
      * @return The value.
      */
    public java.util.List<LineItem> getInvoiceLineItems() {
      return InvoiceLineItems;
    }

    /**
      * Sets the value of the 'InvoiceLineItems' field.
      * @param value The value of 'InvoiceLineItems'.
      * @return This builder.
      */
    public PosInvoice.Builder setInvoiceLineItems(java.util.List<LineItem> value) {
      validate(fields()[16], value);
      this.InvoiceLineItems = value;
      fieldSetFlags()[16] = true;
      return this;
    }

    /**
      * Checks whether the 'InvoiceLineItems' field has been set.
      * @return True if the 'InvoiceLineItems' field has been set, false otherwise.
      */
    public boolean hasInvoiceLineItems() {
      return fieldSetFlags()[16];
    }


    /**
      * Clears the value of the 'InvoiceLineItems' field.
      * @return This builder.
      */
    public PosInvoice.Builder clearInvoiceLineItems() {
      InvoiceLineItems = null;
      fieldSetFlags()[16] = false;
      return this;
    }

    @Override
    public PosInvoice build() {
      try {
        PosInvoice record = new PosInvoice();
        record.InvoiceNumber = fieldSetFlags()[0] ? this.InvoiceNumber : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.CreatedTime = fieldSetFlags()[1] ? this.CreatedTime : (java.lang.Long) defaultValue(fields()[1]);
        record.CustomerCardNo = fieldSetFlags()[2] ? this.CustomerCardNo : (java.lang.Double) defaultValue(fields()[2]);
        record.TotalAmount = fieldSetFlags()[3] ? this.TotalAmount : (java.lang.Double) defaultValue(fields()[3]);
        record.NumberOfItems = fieldSetFlags()[4] ? this.NumberOfItems : (java.lang.Integer) defaultValue(fields()[4]);
        record.PaymentMethod = fieldSetFlags()[5] ? this.PaymentMethod : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.TaxableAmount = fieldSetFlags()[6] ? this.TaxableAmount : (java.lang.Double) defaultValue(fields()[6]);
        record.CGST = fieldSetFlags()[7] ? this.CGST : (java.lang.Double) defaultValue(fields()[7]);
        record.SGST = fieldSetFlags()[8] ? this.SGST : (java.lang.Double) defaultValue(fields()[8]);
        record.CESS = fieldSetFlags()[9] ? this.CESS : (java.lang.Double) defaultValue(fields()[9]);
        record.StoreID = fieldSetFlags()[10] ? this.StoreID : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.PosID = fieldSetFlags()[11] ? this.PosID : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.CashierID = fieldSetFlags()[12] ? this.CashierID : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.CustomerType = fieldSetFlags()[13] ? this.CustomerType : (java.lang.CharSequence) defaultValue(fields()[13]);
        record.DeliveryType = fieldSetFlags()[14] ? this.DeliveryType : (java.lang.CharSequence) defaultValue(fields()[14]);
        if (DeliveryAddressBuilder != null) {
          record.DeliveryAddress = this.DeliveryAddressBuilder.build();
        } else {
          record.DeliveryAddress = fieldSetFlags()[15] ? this.DeliveryAddress : (com.info.types.DeliveryAddress) defaultValue(fields()[15]);
        }
        record.InvoiceLineItems = fieldSetFlags()[16] ? this.InvoiceLineItems : (java.util.List<LineItem>) defaultValue(fields()[16]);
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
