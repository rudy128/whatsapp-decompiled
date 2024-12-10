package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class DN3 implements C28580E8r {
    public static final C25775Clm A05;
    public static final C25775Clm A06;
    public static final BDh A07 = new DMt();
    public static final Charset A08 = Charset.forName(DefaultCrypto.UTF_8);
    public OutputStream A00;
    public final DN4 A01 = new DN4(this);
    public final Map A02;
    public final BDh A03;
    public final Map A04;

    public /* bridge */ /* synthetic */ void BAq(C25775Clm clm, int i) {
        A03(clm, i, true);
    }

    public /* bridge */ /* synthetic */ void BAr(C25775Clm clm, long j) {
        A04(clm, j, true);
    }

    public void BAs(C25775Clm clm, Object obj) {
        A05(clm, obj, true);
    }

    static {
        C25718Cko cko = new C25718Cko("key");
        C24244By2 by2 = C24244By2.DEFAULT;
        A05 = C25718Cko.A00(cko, by2, 1);
        A06 = C25718Cko.A00(new C25718Cko("value"), by2, 2);
    }

    public static int A00(C25775Clm clm) {
        Protobuf protobuf = (Protobuf) ((Annotation) clm.A01.get(Protobuf.class));
        if (protobuf != null) {
            return ((DN6) protobuf).A00;
        }
        throw new C21580AmU("Field has no @Protobuf config");
    }

    private void A01(int i) {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.A00;
            if (i2 != 0) {
                outputStream.write((i & StringTreeSet.OFFSET_BASE_ENCODING) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & StringTreeSet.OFFSET_BASE_ENCODING);
                return;
            }
        }
    }

    private void A02(C25775Clm clm, BDh bDh, Object obj, boolean z) {
        OutputStream outputStream;
        C24227Bxf bxf = new C24227Bxf();
        try {
            outputStream = this.A00;
            this.A00 = bxf;
            bDh.BK0(obj, this);
            this.A00 = outputStream;
            long j = bxf.A00;
            bxf.close();
            if (!z || j != 0) {
                A01((A00(clm) << 3) | 2);
                while (true) {
                    int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
                    OutputStream outputStream2 = this.A00;
                    int i2 = ((int) j) & StringTreeSet.OFFSET_BASE_ENCODING;
                    if (i != 0) {
                        outputStream2.write(i2 | 128);
                        j >>>= 7;
                    } else {
                        outputStream2.write(i2);
                        bDh.BK0(obj, this);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bxf.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
    }

    public void A03(C25775Clm clm, int i, boolean z) {
        if (!z || i != 0) {
            Protobuf protobuf = (Protobuf) ((Annotation) clm.A01.get(Protobuf.class));
            if (protobuf != null) {
                A01(((DN6) protobuf).A00 << 3);
                A01(i);
                return;
            }
            throw new C21580AmU("Field has no @Protobuf config");
        }
    }

    public void A04(C25775Clm clm, long j, boolean z) {
        if (!z || j != 0) {
            Protobuf protobuf = (Protobuf) ((Annotation) clm.A01.get(Protobuf.class));
            if (protobuf != null) {
                A01(((DN6) protobuf).A00 << 3);
                while (true) {
                    int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
                    OutputStream outputStream = this.A00;
                    int i2 = ((int) j) & StringTreeSet.OFFSET_BASE_ENCODING;
                    if (i != 0) {
                        outputStream.write(i2 | 128);
                        j >>>= 7;
                    } else {
                        outputStream.write(i2);
                        return;
                    }
                }
            } else {
                throw new C21580AmU("Field has no @Protobuf config");
            }
        }
    }

    public void A05(C25775Clm clm, Object obj, boolean z) {
        int ordinal;
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (!z || charSequence.length() != 0) {
                A01((A00(clm) << 3) | 2);
                byte[] bytes = charSequence.toString().getBytes(A08);
                A01(bytes.length);
                this.A00.write(bytes);
            }
        } else if (obj instanceof Collection) {
            for (Object A052 : (Collection) obj) {
                A05(clm, A052, false);
            }
        } else if (obj instanceof Map) {
            Iterator A15 = AnonymousClass000.A15((Map) obj);
            while (A15.hasNext()) {
                A02(clm, A07, A15.next(), false);
            }
        } else if (obj instanceof Double) {
            double A002 = AnonymousClass8BR.A00(obj);
            if (!z || A002 != 0.0d) {
                A01((A00(clm) << 3) | 1);
                OutputStream outputStream = this.A00;
                ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                order.putDouble(A002);
                outputStream.write(order.array());
            }
        } else if (obj instanceof Float) {
            float A042 = AnonymousClass000.A04(obj);
            if (!z || A042 != 0.0f) {
                A01((A00(clm) << 3) | 5);
                OutputStream outputStream2 = this.A00;
                ByteBuffer order2 = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
                order2.putFloat(A042);
                outputStream2.write(order2.array());
            }
        } else if (obj instanceof Number) {
            A04(clm, C17880vN.A05(obj), z);
        } else if (obj instanceof Boolean) {
            A03(clm, AnonymousClass000.A1Y(obj) ? 1 : 0, z);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (!z || bArr.length != 0) {
                A01((A00(clm) << 3) | 2);
                A01(bArr.length);
                this.A00.write(bArr);
            }
        } else {
            Map map = this.A02;
            Class<?> cls = obj.getClass();
            BDh bDh = (BDh) map.get(cls);
            if (bDh == null) {
                E65 e65 = (E65) this.A04.get(cls);
                if (e65 != null) {
                    DN4 dn4 = this.A01;
                    dn4.A01 = false;
                    dn4.A00 = clm;
                    dn4.A02 = z;
                    e65.BK0(obj, dn4);
                    return;
                }
                if (obj instanceof E66) {
                    ordinal = ((E66) obj).BVW();
                } else if (obj instanceof Enum) {
                    ordinal = ((Enum) obj).ordinal();
                } else {
                    bDh = this.A03;
                }
                A03(clm, ordinal, true);
                return;
            }
            A02(clm, bDh, obj, z);
        }
    }

    public DN3(BDh bDh, OutputStream outputStream, Map map, Map map2) {
        this.A00 = outputStream;
        this.A02 = map;
        this.A04 = map2;
        this.A03 = bDh;
    }
}
