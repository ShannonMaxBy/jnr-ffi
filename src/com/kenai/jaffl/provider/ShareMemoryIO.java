package com.kenai.jaffl.provider;

import com.kenai.jaffl.Pointer;
import java.nio.charset.Charset;

/**
 *
 */
public class ShareMemoryIO extends AbstractMemoryIO implements DelegatingMemoryIO {

    private final Pointer ptr;
    private final long base;

    public ShareMemoryIO(Pointer parent, long offset) {
        super(parent.getRuntime());
        this.ptr = parent;
        this.base = offset;
    }

    public final boolean isDirect() {
        return ptr.isDirect();
    }

    @Override
    public long address() {
        return ptr.address() + base;
    }

    public long size() {
        return ptr.size() - base;
    }



    public final Pointer getDelegatedMemoryIO() {
        return ptr;
    }

    @Override
    public byte getByte(long offset) {
        return ptr.getByte(base + offset);
    }

    @Override
    public short getShort(long offset) {
        return ptr.getShort(base + offset);
    }

    @Override
    public int getInt(long offset) {
        return ptr.getInt(base + offset);
    }

    @Override
    public long getLong(long offset) {
        return ptr.getLong(base + offset);
    }

    @Override
    public float getFloat(long offset) {
        return ptr.getFloat(base + offset);
    }

    @Override
    public double getDouble(long offset) {
        return ptr.getDouble(base + offset);
    }

    public Pointer getPointer(long offset) {
        return ptr.getPointer(base + offset);
    }

    public Pointer getPointer(long offset, long size) {
        return ptr.getPointer(base + offset, size);
    }

    @Override
    public String getString(long offset) {
        return ptr.getString(base + offset);
    }


    @Override
    public String getString(long offset, int maxLength, Charset cs) {
        return ptr.getString(base + offset, maxLength, cs);
    }


    @Override
    public void putByte(long offset, byte value) {
        ptr.putByte(base + offset, value);
    }

    @Override
    public void putShort(long offset, short value) {
        ptr.putShort(base + offset, value);
    }

    @Override
    public void putInt(long offset, int value) {
        ptr.putInt(base + offset, value);
    }

    @Override
    public void putLong(long offset, long value) {
        ptr.putLong(base + offset, value);
    }

    @Override
    public void putFloat(long offset, float value) {
        ptr.putFloat(base + offset, value);
    }

    @Override
    public void putDouble(long offset, double value) {
        ptr.putDouble(base + offset, value);
    }

    public void putPointer(long offset, Pointer value) {
        ptr.putPointer(base + offset, value);
    }

    @Override
    public void putString(long offset, String string, int maxLength, Charset cs) {
        ptr.putString(base + offset, string, maxLength, cs);
    }

    @Override
    public void get(long offset, byte[] dst, int off, int len) {
        ptr.get(base + offset, dst, off, len);
    }

    @Override
    public void put(long offset, byte[] dst, int off, int len) {
        ptr.put(base + offset, dst, off, len);
    }

    @Override
    public void get(long offset, short[] dst, int off, int len) {
        ptr.get(base + offset, dst, off, len);
    }

    @Override
    public void put(long offset, short[] dst, int off, int len) {
        ptr.put(base + offset, dst, off, len);
    }

    @Override
    public void get(long offset, int[] dst, int off, int len) {
        ptr.get(base + offset, dst, off, len);
    }

    @Override
    public void put(long offset, int[] dst, int off, int len) {
        ptr.put(base + offset, dst, off, len);
    }

    @Override
    public void get(long offset, long[] dst, int off, int len) {
        ptr.get(base + offset, dst, off, len);
    }

    @Override
    public void put(long offset, long[] dst, int off, int len) {
        ptr.put(base + offset, dst, off, len);
    }

    @Override
    public void get(long offset, float[] dst, int off, int len) {
        ptr.get(base + offset, dst, off, len);
    }

    @Override
    public void put(long offset, float[] dst, int off, int len) {
        ptr.put(base + offset, dst, off, len);
    }

    @Override
    public void get(long offset, double[] dst, int off, int len) {
        ptr.get(base + offset, dst, off, len);
    }

    @Override
    public void put(long offset, double[] dst, int off, int len) {
        ptr.put(base + offset, dst, off, len);
    }

    @Override
    public int indexOf(long offset, byte value, int maxlen) {
        return ptr.indexOf(base + offset, value, maxlen);
    }

    @Override
    public void setMemory(long offset, long size, byte value) {
        ptr.setMemory(base + offset, size, value);
    }
}
