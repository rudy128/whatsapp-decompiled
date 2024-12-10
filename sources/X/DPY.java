package X;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;

public class DPY implements EAP {
    public long A00 = 0;
    public final long A01;
    public final DataInputStream A02;

    public boolean Bcp() {
        return C108975cc.A19((this.A00 > this.A01 ? 1 : (this.A00 == this.A01 ? 0 : -1)));
    }

    public void CDM(byte[] bArr) {
        this.A02.read(bArr);
        this.A00 += (long) bArr.length;
    }

    public long CEP() {
        return this.A01 - this.A00;
    }

    public void CK2(long j) {
        CDM(new byte[((int) (j - this.A00))]);
    }

    public void close() {
        this.A02.close();
    }

    public long position() {
        return this.A00;
    }

    public byte readByte() {
        byte readByte = this.A02.readByte();
        this.A00++;
        return readByte;
    }

    public int readInt() {
        int readInt = this.A02.readInt();
        this.A00 += 4;
        return readInt;
    }

    public long readLong() {
        this.A00 += 8;
        return this.A02.readLong();
    }

    public short readShort() {
        short readShort = this.A02.readShort();
        this.A00 += 2;
        return readShort;
    }

    public DPY(File file) {
        this.A01 = file.length();
        this.A02 = new DataInputStream(new BufferedInputStream(C108945cZ.A18(file)));
    }
}
