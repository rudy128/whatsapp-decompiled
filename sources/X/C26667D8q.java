package X;

import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.regex.Matcher;

/* renamed from: X.D8q  reason: case insensitive filesystem */
public abstract class C26667D8q implements E8U {
    public int A00;
    public int A01;
    public int A02;
    public C2C A03;
    public boolean A04;
    public boolean A05;
    public C22765BOc A06;
    public final Object A07 = C17880vN.A0p();
    public final ArrayDeque A08 = new ArrayDeque();
    public final ArrayDeque A09 = new ArrayDeque();
    public final C22765BOc[] A0A;
    public final BOY[] A0B;
    public final Thread A0C;

    public C2C A01(C22765BOc bOc, BOY boy, boolean z) {
        C22767BOg bOg = (C22767BOg) this;
        C22764BOb bOb = (C22764BOb) bOc;
        C22766BOe bOe = (C22766BOe) boy;
        try {
            ByteBuffer byteBuffer = bOb.A01;
            C26056CrS.A01(byteBuffer);
            E91 A062 = bOg.A06(byteBuffer.array(), byteBuffer.limit());
            long j = bOb.A00;
            long j2 = bOb.A00;
            bOe.A01 = j;
            bOe.A01 = A062;
            if (j2 == Long.MAX_VALUE) {
                j2 = j;
            }
            bOe.A00 = j2;
            bOe.A00 = Integer.MAX_VALUE & bOe.A00;
            return null;
        } catch (BOZ e) {
            return e;
        }
    }

    public static long A00(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    public final C22765BOc A02() {
        C22765BOc bOc;
        synchronized (this.A07) {
            C2C c2c = this.A03;
            if (c2c == null) {
                C26056CrS.A03(AnonymousClass000.A1X(this.A06));
                int i = this.A00;
                if (i == 0) {
                    bOc = null;
                } else {
                    C22765BOc[] bOcArr = this.A0A;
                    int i2 = i - 1;
                    this.A00 = i2;
                    bOc = bOcArr[i2];
                }
                this.A06 = bOc;
            } else {
                throw c2c;
            }
        }
        return bOc;
    }

    public final BOY A03() {
        synchronized (this.A07) {
            C2C c2c = this.A03;
            if (c2c == null) {
                ArrayDeque arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    return null;
                }
                BOY boy = (BOY) arrayDeque.removeFirst();
                return boy;
            }
            throw c2c;
        }
    }

    public final void A04(C22765BOc bOc) {
        Object obj = this.A07;
        synchronized (obj) {
            C2C c2c = this.A03;
            if (c2c == null) {
                C26056CrS.A02(AnonymousClass000.A1Z(bOc, this.A06));
                ArrayDeque arrayDeque = this.A08;
                arrayDeque.addLast(bOc);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj.notify();
                }
                this.A06 = null;
            } else {
                throw c2c;
            }
        }
    }

    public void A05(BOY boy) {
        Object obj = this.A07;
        synchronized (obj) {
            boy.clear();
            BOY[] boyArr = this.A0B;
            int i = this.A01;
            this.A01 = i + 1;
            boyArr[i] = boy;
            if (!this.A08.isEmpty() && this.A01 > 0) {
                obj.notify();
            }
        }
    }

    public void flush() {
        synchronized (this.A07) {
            this.A04 = true;
            this.A02 = 0;
            C22765BOc bOc = this.A06;
            if (bOc != null) {
                bOc.clear();
                C22765BOc[] bOcArr = this.A0A;
                int i = this.A00;
                this.A00 = i + 1;
                bOcArr[i] = bOc;
                this.A06 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.A08;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                C22765BOc bOc2 = (C22765BOc) arrayDeque.removeFirst();
                bOc2.clear();
                C22765BOc[] bOcArr2 = this.A0A;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                bOcArr2[i2] = bOc2;
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.A09;
                if (!arrayDeque2.isEmpty()) {
                    ((BOY) arrayDeque2.removeFirst()).release();
                }
            }
        }
    }

    public void release() {
        Object obj = this.A07;
        synchronized (obj) {
            this.A05 = true;
            obj.notify();
        }
        try {
            this.A0C.join();
        } catch (InterruptedException unused) {
            AnonymousClass8BS.A0x();
        }
    }

    public C26667D8q(C22765BOc[] bOcArr, BOY[] boyArr) {
        BOY simpleOutputBuffer;
        C22765BOc bOc;
        this.A0A = bOcArr;
        this.A00 = bOcArr.length;
        for (int i = 0; i < this.A00; i++) {
            C22765BOc[] bOcArr2 = this.A0A;
            if (this instanceof C22767BOg) {
                bOc = new C22765BOc(1);
            } else {
                bOc = new C22765BOc(2);
            }
            bOcArr2[i] = bOc;
        }
        this.A0B = boyArr;
        int length = boyArr.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this instanceof C22767BOg) {
                simpleOutputBuffer = new C22766BOe((C22767BOg) this);
            } else {
                simpleOutputBuffer = new SimpleOutputBuffer(this);
            }
            boyArr[i2] = simpleOutputBuffer;
        }
        C27237DaH daH = new C27237DaH(this);
        this.A0C = daH;
        daH.start();
    }
}
