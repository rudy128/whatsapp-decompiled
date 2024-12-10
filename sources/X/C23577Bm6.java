package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.Bm6  reason: case insensitive filesystem */
public abstract class C23577Bm6 extends DNC {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map defaultInstanceMap = AnonymousClass8BR.A17();
    public int memoizedSerializedSize = -1;
    public C26042Cr6 unknownFields = C26042Cr6.A04;

    public static C23577Bm6 A07(C23577Bm6 bm6, byte[] bArr) {
        AnonymousClass1PN e;
        byte[] bArr2 = bArr;
        int length = bArr.length;
        C26105CsP A00 = C26105CsP.A00();
        C23577Bm6 A0I = DNC.A0I(bm6);
        try {
            EAO A0U = BE9.A0U(A0I);
            A0U.Bjm(new C25573CiD(A00), A0I, bArr2, 0, length);
            A0U.Bih(A0I);
            A0D(A0I);
            return A0I;
        } catch (AnonymousClass1PN e2) {
            e = e2;
            if (e.wasThrownFromInputStream) {
                e = new AnonymousClass1PN((IOException) e);
            }
            e.unfinishedMessage = A0I;
            throw e;
        } catch (C27219DZx e3) {
            e = BE6.A0c(e3.getMessage());
            e.unfinishedMessage = A0I;
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof AnonymousClass1PN) {
                throw e4.getCause();
            }
            e = new AnonymousClass1PN(e4);
            e.unfinishedMessage = A0I;
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = BE7.A0M();
            e.unfinishedMessage = A0I;
            throw e;
        }
    }

    public static Object[] A0G() {
        return new Object[]{"bitField0_", "primary_", "secondary_", "tertiary_", "quaternary_", "quinary_"};
    }

    public static C23577Bm6 A05(C23577Bm6 bm6, InputStream inputStream) {
        C23577Bm6 A03 = A03(new C23585BmF(inputStream), C26105CsP.A00(), bm6);
        A0D(A03);
        return A03;
    }

    public static C24953CRd A0A(C28668EDk eDk, String str, Object[] objArr) {
        return new C24953CRd(eDk, str, objArr);
    }

    public static void A0D(C23577Bm6 bm6) {
        if (bm6 != null && !A0F(bm6)) {
            AnonymousClass1PN A0c = BE6.A0c(new C27219DZx().getMessage());
            A0c.unfinishedMessage = bm6;
            throw A0c;
        }
    }

    public static void A0E(C23577Bm6 bm6, Class cls) {
        bm6.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(cls, bm6);
    }

    public static final boolean A0F(C23577Bm6 bm6) {
        byte byteValue = ((Number) bm6.A0P(AnonymousClass00R.A00, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean Bf7 = BE9.A0U(bm6).Bf7(bm6);
        Integer num = AnonymousClass00R.A01;
        C23577Bm6 bm62 = null;
        if (Bf7) {
            bm62 = bm6;
        }
        bm6.A0P(num, bm62);
        return Bf7;
    }

    public static Object[] A0H(int i) {
        Object[] objArr = new Object[i];
        objArr[0] = "nonce_";
        return objArr;
    }

    public final C23624Bmt A0N() {
        return (C23624Bmt) A0P(AnonymousClass00R.A0Y, (Object) null);
    }

    public final C23624Bmt A0O() {
        C23624Bmt bmt = (C23624Bmt) A0P(AnonymousClass00R.A0Y, (Object) null);
        bmt.A0F(this);
        return bmt;
    }

    public Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        C22357B4l b4l2;
        C22357B4l b4l3;
        C22357B4l b4l4;
        C22357B4l b4l5;
        C22357B4l b4l6;
        C22357B4l b4l7;
        C22357B4l b4l8;
        C22357B4l b4l9;
        C22357B4l b4l10;
        C22357B4l b4l11;
        C22357B4l b4l12;
        C22357B4l b4l13;
        C22357B4l b4l14;
        C22357B4l b4l15;
        C22357B4l b4l16;
        C22357B4l b4l17;
        C22357B4l b4l18;
        C22357B4l b4l19;
        C22357B4l b4l20;
        C22357B4l b4l21;
        C22357B4l b4l22;
        C22357B4l b4l23;
        C22357B4l b4l24;
        C22357B4l b4l25;
        C22357B4l b4l26;
        C22357B4l b4l27;
        C22357B4l b4l28;
        C22357B4l b4l29;
        C22357B4l b4l30;
        C22357B4l b4l31;
        C22357B4l b4l32;
        C22357B4l b4l33;
        C22357B4l b4l34;
        C22357B4l b4l35;
        C22357B4l b4l36;
        if (this instanceof AnonymousClass2B2) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(AnonymousClass2B2.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A0G());
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23623Bms();
                case 5:
                    return AnonymousClass2B2.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l37 = AnonymousClass2B2.PARSER;
                    if (b4l37 != null) {
                        return b4l37;
                    }
                    synchronized (AnonymousClass2B2.class) {
                        b4l36 = AnonymousClass2B2.PARSER;
                        if (b4l36 == null) {
                            C26105CsP csP = DNE.A01;
                            b4l36 = C17880vN.A0F(AnonymousClass2B2.DEFAULT_INSTANCE);
                            AnonymousClass2B2.PARSER = b4l36;
                        }
                    }
                    return b4l36;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof AnonymousClass2B1) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(AnonymousClass2B1.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A0G());
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23622Bmr();
                case 5:
                    return AnonymousClass2B1.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l38 = AnonymousClass2B1.PARSER;
                    if (b4l38 != null) {
                        return b4l38;
                    }
                    synchronized (AnonymousClass2B1.class) {
                        b4l35 = AnonymousClass2B1.PARSER;
                        if (b4l35 == null) {
                            C26105CsP csP2 = DNE.A01;
                            b4l35 = C17880vN.A0F(AnonymousClass2B1.DEFAULT_INSTANCE);
                            AnonymousClass2B1.PARSER = b4l35;
                        }
                    }
                    return b4l35;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23631Bn0) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23631Bn0.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"appID_"});
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23621Bmq();
                case 5:
                    return C23631Bn0.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l39 = C23631Bn0.PARSER;
                    if (b4l39 != null) {
                        return b4l39;
                    }
                    synchronized (C23631Bn0.class) {
                        b4l34 = C23631Bn0.PARSER;
                        if (b4l34 == null) {
                            C26105CsP csP3 = DNE.A01;
                            b4l34 = C17880vN.A0F(C23631Bn0.DEFAULT_INSTANCE);
                            C23631Bn0.PARSER = b4l34;
                        }
                    }
                    return b4l34;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23658BnR) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a = BE6.A1a();
                    A1a[0] = "errorData_";
                    A1a[1] = "errorDataCase_";
                    A1a[2] = "errorCode_";
                    A1a[3] = "status_";
                    return A0A(C23658BnR.DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001c\u0003?\u0000", A1a);
                case 3:
                    return new C23658BnR();
                case 4:
                    return new C23620Bmp();
                case 5:
                    return C23658BnR.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l40 = C23658BnR.PARSER;
                    if (b4l40 != null) {
                        return b4l40;
                    }
                    synchronized (C23658BnR.class) {
                        b4l33 = C23658BnR.PARSER;
                        if (b4l33 == null) {
                            C26105CsP csP4 = DNE.A01;
                            b4l33 = C17880vN.A0F(C23658BnR.DEFAULT_INSTANCE);
                            C23658BnR.PARSER = b4l33;
                        }
                    }
                    return b4l33;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23640Bn9) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1b = AnonymousClass3MW.A1b();
                    A1b[0] = "appID_";
                    A1b[1] = "policy_";
                    return A0A(C23640Bn9.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", A1b);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23617Bmm();
                case 5:
                    return C23640Bn9.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l41 = C23640Bn9.PARSER;
                    if (b4l41 != null) {
                        return b4l41;
                    }
                    synchronized (C23640Bn9.class) {
                        b4l32 = C23640Bn9.PARSER;
                        if (b4l32 == null) {
                            C26105CsP csP5 = DNE.A01;
                            b4l32 = C17880vN.A0F(C23640Bn9.DEFAULT_INSTANCE);
                            C23640Bn9.PARSER = b4l32;
                        }
                    }
                    return b4l32;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23630Bmz) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23630Bmz.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"requiredSpace_"});
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23618Bmn();
                case 5:
                    return C23630Bmz.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l42 = C23630Bmz.PARSER;
                    if (b4l42 != null) {
                        return b4l42;
                    }
                    synchronized (C23630Bmz.class) {
                        b4l31 = C23630Bmz.PARSER;
                        if (b4l31 == null) {
                            C26105CsP csP6 = DNE.A01;
                            b4l31 = C17880vN.A0F(C23630Bmz.DEFAULT_INSTANCE);
                            C23630Bmz.PARSER = b4l31;
                        }
                    }
                    return b4l31;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23629Bmy) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23629Bmy.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"requiredSpaceMB_"});
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23619Bmo();
                case 5:
                    return C23629Bmy.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l43 = C23629Bmy.PARSER;
                    if (b4l43 != null) {
                        return b4l43;
                    }
                    synchronized (C23629Bmy.class) {
                        b4l30 = C23629Bmy.PARSER;
                        if (b4l30 == null) {
                            C26105CsP csP7 = DNE.A01;
                            b4l30 = C17880vN.A0F(C23629Bmy.DEFAULT_INSTANCE);
                            C23629Bmy.PARSER = b4l30;
                        }
                    }
                    return b4l30;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23628Bmx) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23628Bmx.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"target_"});
                case 3:
                    return new C23628Bmx();
                case 4:
                    return new C23616Bml();
                case 5:
                    return C23628Bmx.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l44 = C23628Bmx.PARSER;
                    if (b4l44 != null) {
                        return b4l44;
                    }
                    synchronized (C23628Bmx.class) {
                        b4l29 = C23628Bmx.PARSER;
                        if (b4l29 == null) {
                            C26105CsP csP8 = DNE.A01;
                            b4l29 = C17880vN.A0F(C23628Bmx.DEFAULT_INSTANCE);
                            C23628Bmx.PARSER = b4l29;
                        }
                    }
                    return b4l29;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23627Bmw) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23627Bmw.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"target_"});
                case 3:
                    return new C23627Bmw();
                case 4:
                    return new C23615Bmk();
                case 5:
                    return C23627Bmw.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l45 = C23627Bmw.PARSER;
                    if (b4l45 != null) {
                        return b4l45;
                    }
                    synchronized (C23627Bmw.class) {
                        b4l28 = C23627Bmw.PARSER;
                        if (b4l28 == null) {
                            C26105CsP csP9 = DNE.A01;
                            b4l28 = C17880vN.A0F(C23627Bmw.DEFAULT_INSTANCE);
                            C23627Bmw.PARSER = b4l28;
                        }
                    }
                    return b4l28;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23654BnN) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23654BnN.DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\n\u0002\n\u0003?\u0000\u0004\u000b\u0005\u001c", new Object[]{"keyType_", "keyTypeCase_", "publicKey_", "challenge_", "supportedParameters_", "keyHint_"});
                case 3:
                    return new C23654BnN();
                case 4:
                    return new C23614Bmj();
                case 5:
                    return C23654BnN.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l46 = C23654BnN.PARSER;
                    if (b4l46 != null) {
                        return b4l46;
                    }
                    synchronized (C23654BnN.class) {
                        b4l27 = C23654BnN.PARSER;
                        if (b4l27 == null) {
                            C26105CsP csP10 = DNE.A01;
                            b4l27 = C17880vN.A0F(C23654BnN.DEFAULT_INSTANCE);
                            C23654BnN.PARSER = b4l27;
                        }
                    }
                    return b4l27;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23625Bmu) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23625Bmu.DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23613Bmi();
                case 5:
                    return C23625Bmu.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l47 = C23625Bmu.PARSER;
                    if (b4l47 != null) {
                        return b4l47;
                    }
                    synchronized (C23625Bmu.class) {
                        b4l26 = C23625Bmu.PARSER;
                        if (b4l26 == null) {
                            C26105CsP csP11 = DNE.A01;
                            b4l26 = C17880vN.A0F(C23625Bmu.DEFAULT_INSTANCE);
                            C23625Bmu.PARSER = b4l26;
                        }
                    }
                    return b4l26;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23652BnL) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23652BnL.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\f\u0002\n\u0003\n\u00042", new Object[]{"state_", "uuid_", "linkUuid_", "userData_", CG4.A00});
                case 3:
                    return new C23652BnL();
                case 4:
                    return new C23612Bmh();
                case 5:
                    return C23652BnL.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l48 = C23652BnL.PARSER;
                    if (b4l48 != null) {
                        return b4l48;
                    }
                    synchronized (C23652BnL.class) {
                        b4l25 = C23652BnL.PARSER;
                        if (b4l25 == null) {
                            C26105CsP csP12 = DNE.A01;
                            b4l25 = C17880vN.A0F(C23652BnL.DEFAULT_INSTANCE);
                            C23652BnL.PARSER = b4l25;
                        }
                    }
                    return b4l25;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23653BnM) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23653BnM.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\u000b\u0005\u000b", new Object[]{"publicKey_", "seed_", "iv_", "base_", "parameters_"});
                case 3:
                    return new C23653BnM();
                case 4:
                    return new C23611Bmg();
                case 5:
                    return C23653BnM.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l49 = C23653BnM.PARSER;
                    if (b4l49 != null) {
                        return b4l49;
                    }
                    synchronized (C23653BnM.class) {
                        b4l24 = C23653BnM.PARSER;
                        if (b4l24 == null) {
                            C26105CsP csP13 = DNE.A01;
                            b4l24 = C17880vN.A0F(C23653BnM.DEFAULT_INSTANCE);
                            C23653BnM.PARSER = b4l24;
                        }
                    }
                    return b4l24;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23647BnG) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H = A0H(3);
                    A0H[1] = "error_";
                    A0H[2] = "serviceUUID_";
                    return A0A(C23647BnG.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n", A0H);
                case 3:
                    return new C23647BnG();
                case 4:
                    return new C23610Bmf();
                case 5:
                    return C23647BnG.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l50 = C23647BnG.PARSER;
                    if (b4l50 != null) {
                        return b4l50;
                    }
                    synchronized (C23647BnG.class) {
                        b4l23 = C23647BnG.PARSER;
                        if (b4l23 == null) {
                            C26105CsP csP14 = DNE.A01;
                            b4l23 = C17880vN.A0F(C23647BnG.DEFAULT_INSTANCE);
                            C23647BnG.PARSER = b4l23;
                        }
                    }
                    return b4l23;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23639Bn8) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H2 = A0H(2);
                    A0H2[1] = "appPublicKey_";
                    return A0A(C23639Bn8.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", A0H2);
                case 3:
                    return new C23639Bn8();
                case 4:
                    return new C23609Bme();
                case 5:
                    return C23639Bn8.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l51 = C23639Bn8.PARSER;
                    if (b4l51 != null) {
                        return b4l51;
                    }
                    synchronized (C23639Bn8.class) {
                        b4l22 = C23639Bn8.PARSER;
                        if (b4l22 == null) {
                            C26105CsP csP15 = DNE.A01;
                            b4l22 = C17880vN.A0F(C23639Bn8.DEFAULT_INSTANCE);
                            C23639Bn8.PARSER = b4l22;
                        }
                    }
                    return b4l22;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23656BnP) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H3 = A0H(12);
                    A0H3[1] = "error_";
                    A0H3[2] = "addresses_";
                    A0H3[3] = C23646BnF.class;
                    A0H3[4] = "firmwareVersion_";
                    A0H3[5] = "deviceSerial_";
                    A0H3[6] = "deviceImageAssetURI_";
                    A0H3[7] = "deviceModelName_";
                    A0H3[8] = "buildFlavor_";
                    A0H3[9] = "deviceName_";
                    A0H3[10] = "hardwareType_";
                    A0H3[11] = "macAddress_";
                    return A0A(C23656BnP.DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002\f\u0003\u001b\u0004\n\u0005\n\u0006\n\u0007\n\b\n\t\n\n\n\u000b\n", A0H3);
                case 3:
                    return new C23656BnP();
                case 4:
                    return new C23608Bmd();
                case 5:
                    return C23656BnP.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l52 = C23656BnP.PARSER;
                    if (b4l52 != null) {
                        return b4l52;
                    }
                    synchronized (C23656BnP.class) {
                        b4l21 = C23656BnP.PARSER;
                        if (b4l21 == null) {
                            C26105CsP csP16 = DNE.A01;
                            b4l21 = C17880vN.A0F(C23656BnP.DEFAULT_INSTANCE);
                            C23656BnP.PARSER = b4l21;
                        }
                    }
                    return b4l21;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23651BnK) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H4 = A0H(4);
                    A0H4[1] = "serviceUUID_";
                    A0H4[2] = "linkType_";
                    A0H4[3] = "requestType_";
                    return A0A(C23651BnK.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\f\u0004\f", A0H4);
                case 3:
                    return new C23651BnK();
                case 4:
                    return new C23607Bmc();
                case 5:
                    return C23651BnK.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l53 = C23651BnK.PARSER;
                    if (b4l53 != null) {
                        return b4l53;
                    }
                    synchronized (C23651BnK.class) {
                        b4l20 = C23651BnK.PARSER;
                        if (b4l20 == null) {
                            C26105CsP csP17 = DNE.A01;
                            b4l20 = C17880vN.A0F(C23651BnK.DEFAULT_INSTANCE);
                            C23651BnK.PARSER = b4l20;
                        }
                    }
                    return b4l20;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23650BnJ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H5 = A0H(4);
                    A0H5[1] = "error_";
                    A0H5[2] = "serviceUUID_";
                    A0H5[3] = "devicePublicKey_";
                    return A0A(C23650BnJ.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n\u0004\n", A0H5);
                case 3:
                    return new C23650BnJ();
                case 4:
                    return new C23606Bmb();
                case 5:
                    return C23650BnJ.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l54 = C23650BnJ.PARSER;
                    if (b4l54 != null) {
                        return b4l54;
                    }
                    synchronized (C23650BnJ.class) {
                        b4l19 = C23650BnJ.PARSER;
                        if (b4l19 == null) {
                            C26105CsP csP18 = DNE.A01;
                            b4l19 = C17880vN.A0F(C23650BnJ.DEFAULT_INSTANCE);
                            C23650BnJ.PARSER = b4l19;
                        }
                    }
                    return b4l19;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23638Bn7) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H6 = A0H(2);
                    A0H6[1] = "serviceUUID_";
                    return A0A(C23638Bn7.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", A0H6);
                case 3:
                    return new C23638Bn7();
                case 4:
                    return new C23605Bma();
                case 5:
                    return C23638Bn7.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l55 = C23638Bn7.PARSER;
                    if (b4l55 != null) {
                        return b4l55;
                    }
                    synchronized (C23638Bn7.class) {
                        b4l18 = C23638Bn7.PARSER;
                        if (b4l18 == null) {
                            C26105CsP csP19 = DNE.A01;
                            b4l18 = C17880vN.A0F(C23638Bn7.DEFAULT_INSTANCE);
                            C23638Bn7.PARSER = b4l18;
                        }
                    }
                    return b4l18;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23646BnF) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a2 = AnonymousClass8BR.A1a();
                    A1a2[0] = "addressType_";
                    A1a2[1] = "prefixLength_";
                    A1a2[2] = "data_";
                    return A0A(C23646BnF.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\n", A1a2);
                case 3:
                    return new C23646BnF();
                case 4:
                    return new C23604BmZ();
                case 5:
                    return C23646BnF.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l56 = C23646BnF.PARSER;
                    if (b4l56 != null) {
                        return b4l56;
                    }
                    synchronized (C23646BnF.class) {
                        b4l17 = C23646BnF.PARSER;
                        if (b4l17 == null) {
                            C26105CsP csP20 = DNE.A01;
                            b4l17 = C17880vN.A0F(C23646BnF.DEFAULT_INSTANCE);
                            C23646BnF.PARSER = b4l17;
                        }
                    }
                    return b4l17;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23655BnO) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23655BnO.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\f\b\u000b", new Object[]{"mime_", "width_", "height_", "bitrate_", "frameRate_", "iFrameInterval_", "eisMode_", "captureFrameRate_"});
                case 3:
                    return new C23655BnO();
                case 4:
                    return new C23603BmY();
                case 5:
                    return C23655BnO.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l57 = C23655BnO.PARSER;
                    if (b4l57 != null) {
                        return b4l57;
                    }
                    synchronized (C23655BnO.class) {
                        b4l16 = C23655BnO.PARSER;
                        if (b4l16 == null) {
                            C26105CsP csP21 = DNE.A01;
                            b4l16 = C17880vN.A0F(C23655BnO.DEFAULT_INSTANCE);
                            C23655BnO.PARSER = b4l16;
                        }
                    }
                    return b4l16;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23657BnQ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1b2 = AnonymousClass3MW.A1b();
                    A1b2[0] = "userEvent_";
                    A1b2[1] = "userEventAction_";
                    return A0A(C23657BnQ.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", A1b2);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23602BmX();
                case 5:
                    return C23657BnQ.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l58 = C23657BnQ.PARSER;
                    if (b4l58 != null) {
                        return b4l58;
                    }
                    synchronized (C23657BnQ.class) {
                        b4l15 = C23657BnQ.PARSER;
                        if (b4l15 == null) {
                            C26105CsP csP22 = DNE.A01;
                            b4l15 = C17880vN.A0F(C23657BnQ.DEFAULT_INSTANCE);
                            C23657BnQ.PARSER = b4l15;
                        }
                    }
                    return b4l15;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23645BnE) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a3 = AnonymousClass8BR.A1a();
                    A1a3[0] = "status_";
                    A1a3[1] = "type_";
                    A1a3[2] = "level_";
                    return A0A(C23645BnE.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0010", A1a3);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23601BmW();
                case 5:
                    return C23645BnE.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l59 = C23645BnE.PARSER;
                    if (b4l59 != null) {
                        return b4l59;
                    }
                    synchronized (C23645BnE.class) {
                        b4l14 = C23645BnE.PARSER;
                        if (b4l14 == null) {
                            C26105CsP csP23 = DNE.A01;
                            b4l14 = C17880vN.A0F(C23645BnE.DEFAULT_INSTANCE);
                            C23645BnE.PARSER = b4l14;
                        }
                    }
                    return b4l14;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23637Bn6) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H7 = A0H(2);
                    A0H7[1] = "videoQuality_";
                    return A0A(C23637Bn6.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\f", A0H7);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23600BmV();
                case 5:
                    return C23637Bn6.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l60 = C23637Bn6.PARSER;
                    if (b4l60 != null) {
                        return b4l60;
                    }
                    synchronized (C23637Bn6.class) {
                        b4l13 = C23637Bn6.PARSER;
                        if (b4l13 == null) {
                            C26105CsP csP24 = DNE.A01;
                            b4l13 = C17880vN.A0F(C23637Bn6.DEFAULT_INSTANCE);
                            C23637Bn6.PARSER = b4l13;
                        }
                    }
                    return b4l13;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23626Bmv) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23626Bmv.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"event_"});
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23599BmU();
                case 5:
                    return C23626Bmv.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l61 = C23626Bmv.PARSER;
                    if (b4l61 != null) {
                        return b4l61;
                    }
                    synchronized (C23626Bmv.class) {
                        b4l12 = C23626Bmv.PARSER;
                        if (b4l12 == null) {
                            C26105CsP csP25 = DNE.A01;
                            b4l12 = C17880vN.A0F(C23626Bmv.DEFAULT_INSTANCE);
                            C23626Bmv.PARSER = b4l12;
                        }
                    }
                    return b4l12;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23649BnI) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A0A(C23649BnI.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0003\u0000\u0000\u0001\f\u00022\u00032\u00042", new Object[]{"eventType_", "stringTypeEventMap_", CG3.A00, "floatTypeEventMap_", CG2.A00, "boolTypeEventMap_", CG1.A00});
                case 3:
                    return new C23649BnI();
                case 4:
                    return new C23598BmT();
                case 5:
                    return C23649BnI.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l62 = C23649BnI.PARSER;
                    if (b4l62 != null) {
                        return b4l62;
                    }
                    synchronized (C23649BnI.class) {
                        b4l11 = C23649BnI.PARSER;
                        if (b4l11 == null) {
                            C26105CsP csP26 = DNE.A01;
                            b4l11 = C17880vN.A0F(C23649BnI.DEFAULT_INSTANCE);
                            C23649BnI.PARSER = b4l11;
                        }
                    }
                    return b4l11;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23644BnD) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a4 = AnonymousClass8BR.A1a();
                    A1a4[0] = "tag_";
                    A1a4[1] = "presentationTimeUs_";
                    A1a4[2] = "metadata_";
                    return A0A(C23644BnD.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\n", A1a4);
                case 3:
                    return new C23644BnD();
                case 4:
                    return new C23597BmS();
                case 5:
                    return C23644BnD.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l63 = C23644BnD.PARSER;
                    if (b4l63 != null) {
                        return b4l63;
                    }
                    synchronized (C23644BnD.class) {
                        b4l10 = C23644BnD.PARSER;
                        if (b4l10 == null) {
                            C26105CsP csP27 = DNE.A01;
                            b4l10 = C17880vN.A0F(C23644BnD.DEFAULT_INSTANCE);
                            C23644BnD.PARSER = b4l10;
                        }
                    }
                    return b4l10;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23648BnH) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1a5 = BE6.A1a();
                    A1a5[0] = "bypassDonCheck_";
                    A1a5[1] = "mediaBatchingIntervalMs_";
                    A1a5[2] = "allowFrameCapture_";
                    A1a5[3] = "allowOcrStreaming_";
                    return A0A(C23648BnH.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u0007\u0004\u0007", A1a5);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23596BmR();
                case 5:
                    return C23648BnH.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l64 = C23648BnH.PARSER;
                    if (b4l64 != null) {
                        return b4l64;
                    }
                    synchronized (C23648BnH.class) {
                        b4l9 = C23648BnH.PARSER;
                        if (b4l9 == null) {
                            C26105CsP csP28 = DNE.A01;
                            b4l9 = C17880vN.A0F(C23648BnH.DEFAULT_INSTANCE);
                            C23648BnH.PARSER = b4l9;
                        }
                    }
                    return b4l9;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23636Bn5) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A1b3 = AnonymousClass3MW.A1b();
                    A1b3[0] = "code_";
                    A1b3[1] = "reason_";
                    return A0A(C23636Bn5.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", A1b3);
                case 3:
                    return new C23636Bn5();
                case 4:
                    return new C23595BmQ();
                case 5:
                    return C23636Bn5.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l65 = C23636Bn5.PARSER;
                    if (b4l65 != null) {
                        return b4l65;
                    }
                    synchronized (C23636Bn5.class) {
                        b4l8 = C23636Bn5.PARSER;
                        if (b4l8 == null) {
                            C26105CsP csP29 = DNE.A01;
                            b4l8 = C17880vN.A0F(C23636Bn5.DEFAULT_INSTANCE);
                            C23636Bn5.PARSER = b4l8;
                        }
                    }
                    return b4l8;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23635Bn4) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H8 = A0H(2);
                    A0H8[1] = "reason_";
                    return A0A(C23635Bn4.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\f", A0H8);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23594BmP();
                case 5:
                    return C23635Bn4.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l66 = C23635Bn4.PARSER;
                    if (b4l66 != null) {
                        return b4l66;
                    }
                    synchronized (C23635Bn4.class) {
                        b4l7 = C23635Bn4.PARSER;
                        if (b4l7 == null) {
                            C26105CsP csP30 = DNE.A01;
                            b4l7 = C17880vN.A0F(C23635Bn4.DEFAULT_INSTANCE);
                            C23635Bn4.PARSER = b4l7;
                        }
                    }
                    return b4l7;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23634Bn3) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H9 = A0H(2);
                    A0H9[1] = "error_";
                    return A0A(C23634Bn3.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", A0H9);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23593BmO();
                case 5:
                    return C23634Bn3.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l67 = C23634Bn3.PARSER;
                    if (b4l67 != null) {
                        return b4l67;
                    }
                    synchronized (C23634Bn3.class) {
                        b4l6 = C23634Bn3.PARSER;
                        if (b4l6 == null) {
                            C26105CsP csP31 = DNE.A01;
                            b4l6 = C17880vN.A0F(C23634Bn3.DEFAULT_INSTANCE);
                            C23634Bn3.PARSER = b4l6;
                        }
                    }
                    return b4l6;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23633Bn2) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H10 = A0H(2);
                    A0H10[1] = "action_";
                    return A0A(C23633Bn2.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\f", A0H10);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23592BmN();
                case 5:
                    return C23633Bn2.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l68 = C23633Bn2.PARSER;
                    if (b4l68 != null) {
                        return b4l68;
                    }
                    synchronized (C23633Bn2.class) {
                        b4l5 = C23633Bn2.PARSER;
                        if (b4l5 == null) {
                            C26105CsP csP32 = DNE.A01;
                            b4l5 = C17880vN.A0F(C23633Bn2.DEFAULT_INSTANCE);
                            C23633Bn2.PARSER = b4l5;
                        }
                    }
                    return b4l5;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23632Bn1) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H11 = A0H(2);
                    A0H11[1] = "error_";
                    return A0A(C23632Bn1.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", A0H11);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23591BmM();
                case 5:
                    return C23632Bn1.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l69 = C23632Bn1.PARSER;
                    if (b4l69 != null) {
                        return b4l69;
                    }
                    synchronized (C23632Bn1.class) {
                        b4l4 = C23632Bn1.PARSER;
                        if (b4l4 == null) {
                            C26105CsP csP33 = DNE.A01;
                            b4l4 = C17880vN.A0F(C23632Bn1.DEFAULT_INSTANCE);
                            C23632Bn1.PARSER = b4l4;
                        }
                    }
                    return b4l4;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23643BnC) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] A0H12 = A0H(3);
                    A0H12[1] = "config_";
                    A0H12[2] = "enabled_";
                    return A0A(C23643BnC.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\u0007", A0H12);
                case 3:
                    return new C23577Bm6();
                case 4:
                    return new C23590BmL();
                case 5:
                    return C23643BnC.DEFAULT_INSTANCE;
                case 6:
                    C22357B4l b4l70 = C23643BnC.PARSER;
                    if (b4l70 != null) {
                        return b4l70;
                    }
                    synchronized (C23643BnC.class) {
                        b4l3 = C23643BnC.PARSER;
                        if (b4l3 == null) {
                            C26105CsP csP34 = DNE.A01;
                            b4l3 = C17880vN.A0F(C23643BnC.DEFAULT_INSTANCE);
                            C23643BnC.PARSER = b4l3;
                        }
                    }
                    return b4l3;
                default:
                    throw C17880vN.A0y();
            }
        } else {
            boolean z = this instanceof C23642BnB;
            int intValue = num.intValue();
            if (z) {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        Object[] A0H13 = A0H(3);
                        A0H13[1] = "tag_";
                        A0H13[2] = "error_";
                        return A0A(C23642BnB.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u0004\u0003\t", A0H13);
                    case 3:
                        return new C23577Bm6();
                    case 4:
                        return new C23589BmK();
                    case 5:
                        return C23642BnB.DEFAULT_INSTANCE;
                    case 6:
                        C22357B4l b4l71 = C23642BnB.PARSER;
                        if (b4l71 != null) {
                            return b4l71;
                        }
                        synchronized (C23642BnB.class) {
                            b4l2 = C23642BnB.PARSER;
                            if (b4l2 == null) {
                                C26105CsP csP35 = DNE.A01;
                                b4l2 = C17880vN.A0F(C23642BnB.DEFAULT_INSTANCE);
                                C23642BnB.PARSER = b4l2;
                            }
                        }
                        return b4l2;
                    default:
                        throw C17880vN.A0y();
                }
            } else {
                switch (intValue) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        Object[] A0H14 = A0H(3);
                        A0H14[1] = "type_";
                        A0H14[2] = "config_";
                        return A0A(C23641BnA.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n", A0H14);
                    case 3:
                        return new C23641BnA();
                    case 4:
                        return new C23588BmJ();
                    case 5:
                        return C23641BnA.DEFAULT_INSTANCE;
                    case 6:
                        C22357B4l b4l72 = C23641BnA.PARSER;
                        if (b4l72 != null) {
                            return b4l72;
                        }
                        synchronized (C23641BnA.class) {
                            b4l = C23641BnA.PARSER;
                            if (b4l == null) {
                                C26105CsP csP36 = DNE.A01;
                                b4l = C17880vN.A0F(C23641BnA.DEFAULT_INSTANCE);
                                C23641BnA.PARSER = b4l;
                            }
                        }
                        return b4l;
                    default:
                        throw C17880vN.A0y();
                }
            }
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C25661Cjr.A02.A00(cls).BKS(this, obj);
    }

    public int hashCode() {
        if (AnonymousClass000.A1O(this.memoizedSerializedSize & Integer.MIN_VALUE)) {
            return BE9.A0U(this).Bcu(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int Bcu = BE9.A0U(this).Bcu(this);
        this.memoizedHashCode = Bcu;
        return Bcu;
    }

    public static C23577Bm6 A02(DSQ dsq, C23577Bm6 bm6) {
        C26105CsP A00 = C26105CsP.A00();
        C23581BmB bmB = (C23581BmB) dsq;
        C23583BmD A07 = C25857CnL.A07(bmB.bytes, bmB.A07(), bmB.A02());
        C23577Bm6 A03 = A03(A07, A00, bm6);
        try {
            A07.A0R(0);
            A0D(A03);
            A0D(A03);
            return A03;
        } catch (AnonymousClass1PN e) {
            e.unfinishedMessage = A03;
            throw e;
        }
    }

    public static C23577Bm6 A03(C25857CnL cnL, C26105CsP csP, C23577Bm6 bm6) {
        Throwable e;
        C23577Bm6 A0I = DNC.A0I(bm6);
        try {
            EAO A0U = BE9.A0U(A0I);
            C26282Cwd cwd = cnL.A01;
            if (cwd == null) {
                cwd = new C26282Cwd(cnL);
            }
            A0U.Bjl(cwd, csP, A0I);
            A0U.Bih(A0I);
            return A0I;
        } catch (AnonymousClass1PN e2) {
            e = e2;
            if (e.wasThrownFromInputStream) {
                e = new AnonymousClass1PN((IOException) e);
            }
            e.unfinishedMessage = A0I;
            throw e;
        } catch (C27219DZx e3) {
            AnonymousClass1PN A0c = BE6.A0c(e3.getMessage());
            A0c.unfinishedMessage = A0I;
            throw A0c;
        } catch (IOException e4) {
            if (e4.getCause() instanceof AnonymousClass1PN) {
                e = e4.getCause();
                throw e;
            }
            e = new AnonymousClass1PN(e4);
            e.unfinishedMessage = A0I;
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            if (e.getCause() instanceof AnonymousClass1PN) {
                throw e.getCause();
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r0 = X.BE7.A0M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C23577Bm6 A04(X.C23577Bm6 r6, java.io.InputStream r7) {
        /*
            X.CsP r5 = X.C26105CsP.A00()
            int r4 = r7.read()     // Catch:{ 1PN -> 0x0061, IOException -> 0x006c }
            r3 = -1
            if (r4 != r3) goto L_0x000c
            goto L_0x0058
        L_0x000c:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            r4 = r4 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0013:
            int r1 = r7.read()     // Catch:{ 1PN -> 0x0061, IOException -> 0x006c }
            if (r1 == r3) goto L_0x0039
            r0 = r1 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            int r2 = r2 + 7
            r0 = 32
            if (r2 >= r0) goto L_0x0028
            goto L_0x0013
        L_0x0028:
            r0 = 64
            if (r2 >= r0) goto L_0x003e
            int r0 = r7.read()     // Catch:{ 1PN -> 0x0061, IOException -> 0x006c }
            if (r0 == r3) goto L_0x0039
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            int r2 = r2 + 7
            goto L_0x0028
        L_0x0039:
            X.1PN r0 = X.BE7.A0M()     // Catch:{ 1PN -> 0x0061, IOException -> 0x006c }
            goto L_0x0044
        L_0x003e:
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.1PN r0 = X.BE6.A0c(r0)     // Catch:{ 1PN -> 0x0061, IOException -> 0x006c }
        L_0x0044:
            throw r0     // Catch:{ 1PN -> 0x0061, IOException -> 0x006c }
        L_0x0045:
            X.Bwm r0 = new X.Bwm
            r0.<init>(r7, r4)
            X.BmF r1 = new X.BmF
            r1.<init>(r0)
            X.Bm6 r2 = A03(r1, r5, r6)
            r0 = 0
            r1.A0R(r0)     // Catch:{ 1PN -> 0x005d }
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            A0D(r2)
            return r2
        L_0x005d:
            r1 = move-exception
            r1.unfinishedMessage = r2
            throw r1
        L_0x0061:
            r1 = move-exception
            boolean r0 = r1.wasThrownFromInputStream
            if (r0 == 0) goto L_0x0072
            X.1PN r0 = new X.1PN
            r0.<init>((java.io.IOException) r1)
            throw r0
        L_0x006c:
            r0 = move-exception
            X.1PN r1 = new X.1PN
            r1.<init>((java.io.IOException) r0)
        L_0x0072:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23577Bm6.A04(X.Bm6, java.io.InputStream):X.Bm6");
    }

    public static C23577Bm6 A06(C23577Bm6 bm6, ByteBuffer byteBuffer) {
        C25857CnL A07;
        C26105CsP A00 = C26105CsP.A00();
        if (byteBuffer.hasArray()) {
            A07 = C25857CnL.A07(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else if (!byteBuffer.isDirect() || !UnsafeUtil.A06) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            A07 = C25857CnL.A07(bArr, 0, remaining);
        } else {
            A07 = new C23584BmE(byteBuffer);
        }
        C23577Bm6 A03 = A03(A07, A00, bm6);
        A0D(A03);
        A0D(A03);
        return A03;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.DbR, X.Bm7] */
    public static Bm7 A08(C28667EDj eDj) {
        int size = eDj.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        Bm7 bm7 = (Bm7) eDj;
        if (i >= bm7.A00) {
            int[] copyOf = Arrays.copyOf(bm7.A01, i);
            int i2 = bm7.A00;
            ? dbR = new C27296DbR();
            dbR.A01 = copyOf;
            dbR.A00 = i2;
            return dbR;
        }
        throw BE6.A0j();
    }

    public static EE9 A09(EE9 ee9) {
        int size = ee9.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        return ee9.Bk8(i);
    }

    public static C24953CRd A0B(C28668EDk eDk, String str, Object[] objArr) {
        return A0A(eDk, str, objArr);
    }

    public static Object A0C(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw BE6.A0o("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BE6.A0o("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public void A0Q() {
        BE9.A0U(this).Bih(this);
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void CSU(CodedOutputStream codedOutputStream) {
        EAO A0U = BE9.A0U(this);
        CVN cvn = codedOutputStream.A00;
        if (cvn == null) {
            cvn = new CVN(codedOutputStream);
        }
        A0U.CSV(cvn, this);
    }

    public String toString() {
        String obj = super.toString();
        char[] cArr = C25911CoV.A00;
        StringBuilder A0t = BEA.A0t(obj);
        C25911CoV.A00(this, A0t, 0);
        return A0t.toString();
    }
}
