/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mycompany.commons.storeapp.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Product extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7043691455637012826L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Product\",\"namespace\":\"com.mycompany.commons.storeapp.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"created_at\",\"type\":{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"name\",\"type\":\"string\"}],\"connect.name\":\"com.mycompany.commons.storeapp.avro.Product\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Product> ENCODER =
      new BinaryMessageEncoder<Product>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Product> DECODER =
      new BinaryMessageDecoder<Product>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Product> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Product> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Product>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Product to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Product from a ByteBuffer. */
  public static Product fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long id;
  @Deprecated public org.joda.time.DateTime created_at;
  @Deprecated public java.lang.CharSequence name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Product() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param created_at The new value for created_at
   * @param name The new value for name
   */
  public Product(java.lang.Long id, org.joda.time.DateTime created_at, java.lang.CharSequence name) {
    this.id = id;
    this.created_at = created_at;
    this.name = name;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return created_at;
    case 2: return name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  protected static final org.apache.avro.data.TimeConversions.DateConversion DATE_CONVERSION = new org.apache.avro.data.TimeConversions.DateConversion();
  protected static final org.apache.avro.data.TimeConversions.TimeConversion TIME_CONVERSION = new org.apache.avro.data.TimeConversions.TimeConversion();
  protected static final org.apache.avro.data.TimeConversions.TimestampConversion TIMESTAMP_CONVERSION = new org.apache.avro.data.TimeConversions.TimestampConversion();
  protected static final org.apache.avro.Conversions.DecimalConversion DECIMAL_CONVERSION = new org.apache.avro.Conversions.DecimalConversion();

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      TIMESTAMP_CONVERSION,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: created_at = (org.joda.time.DateTime)value$; break;
    case 2: name = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'created_at' field.
   * @return The value of the 'created_at' field.
   */
  public org.joda.time.DateTime getCreatedAt() {
    return created_at;
  }

  /**
   * Sets the value of the 'created_at' field.
   * @param value the value to set.
   */
  public void setCreatedAt(org.joda.time.DateTime value) {
    this.created_at = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Creates a new Product RecordBuilder.
   * @return A new Product RecordBuilder
   */
  public static com.mycompany.commons.storeapp.avro.Product.Builder newBuilder() {
    return new com.mycompany.commons.storeapp.avro.Product.Builder();
  }

  /**
   * Creates a new Product RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Product RecordBuilder
   */
  public static com.mycompany.commons.storeapp.avro.Product.Builder newBuilder(com.mycompany.commons.storeapp.avro.Product.Builder other) {
    return new com.mycompany.commons.storeapp.avro.Product.Builder(other);
  }

  /**
   * Creates a new Product RecordBuilder by copying an existing Product instance.
   * @param other The existing instance to copy.
   * @return A new Product RecordBuilder
   */
  public static com.mycompany.commons.storeapp.avro.Product.Builder newBuilder(com.mycompany.commons.storeapp.avro.Product other) {
    return new com.mycompany.commons.storeapp.avro.Product.Builder(other);
  }

  /**
   * RecordBuilder for Product instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Product>
    implements org.apache.avro.data.RecordBuilder<Product> {

    private long id;
    private org.joda.time.DateTime created_at;
    private java.lang.CharSequence name;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mycompany.commons.storeapp.avro.Product.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.created_at)) {
        this.created_at = data().deepCopy(fields()[1].schema(), other.created_at);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Product instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mycompany.commons.storeapp.avro.Product other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.created_at)) {
        this.created_at = data().deepCopy(fields()[1].schema(), other.created_at);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Product.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Product.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'created_at' field.
      * @return The value.
      */
    public org.joda.time.DateTime getCreatedAt() {
      return created_at;
    }

    /**
      * Sets the value of the 'created_at' field.
      * @param value The value of 'created_at'.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Product.Builder setCreatedAt(org.joda.time.DateTime value) {
      validate(fields()[1], value);
      this.created_at = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'created_at' field has been set.
      * @return True if the 'created_at' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'created_at' field.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Product.Builder clearCreatedAt() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Product.Builder setName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Product.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Product build() {
      try {
        Product record = new Product();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0], record.getConversion(0));
        record.created_at = fieldSetFlags()[1] ? this.created_at : (org.joda.time.DateTime) defaultValue(fields()[1], record.getConversion(1));
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.CharSequence) defaultValue(fields()[2], record.getConversion(2));
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Product>
    WRITER$ = (org.apache.avro.io.DatumWriter<Product>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Product>
    READER$ = (org.apache.avro.io.DatumReader<Product>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
