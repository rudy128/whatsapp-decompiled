package X;

import java.io.DataOutputStream;

public class DPX implements EAP {
    public final EAP A00;
    public final DataOutputStream A01;

    public boolean Bcp() {
        return this.A00.Bcp();
    }

    public void CDM(byte[] bArr) {
        this.A00.CDM(bArr);
        this.A01.write(bArr);
    }

    public long CEP() {
        return this.A00.CEP();
    }

    public void CK2(long j) {
        CDM(new byte[((int) (j - this.A00.position()))]);
    }

    public void close() {
        this.A00.close();
        this.A01.close();
    }

    public long position() {
        return this.A00.position();
    }

    public byte readByte() {
        byte readByte = this.A00.readByte();
        this.A01.write(readByte);
        return readByte;
    }

    public int readInt() {
        int readInt = this.A00.readInt();
        this.A01.writeInt(readInt);
        return readInt;
    }

    public long readLong() {
        long readLong = this.A00.readLong();
        this.A01.writeLong(readLong);
        return readLong;
    }

    public short readShort() {
        short readShort = this.A00.readShort();
        this.A01.writeShort(readShort);
        return readShort;
    }

    public DPX(EAP eap, DataOutputStream dataOutputStream) {
        this.A00 = eap;
        this.A01 = dataOutputStream;
    }
}
