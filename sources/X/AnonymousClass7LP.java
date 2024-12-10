package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.7LP  reason: invalid class name */
public class AnonymousClass7LP implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass7LP(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public void BrD(String str) {
        if (this.A00 != 0) {
            C17900vP.A0f("GdprXmppMethods/sendDeleteGdprReport/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
            ((C23570Bly) this.A03).A04(new RuntimeException(AnonymousClass001.A1H("XMPP IQ was not delivered: iq=", str, AnonymousClass000.A10())));
            return;
        }
        ((C132396mi) this.A02).A00(str, "Delivery failure", -1);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.2rm] */
    public void Bt9(C29621ca r7, String str) {
        String str2;
        if (this.A00 != 0) {
            int A002 = C60482o6.A00(r7);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GdprXmppMethods/sendDeleteGdprReport/onError; iq=");
            A10.append(str);
            C17900vP.A0j(", error=", A10, A002);
            ((B9K) this.A02).CGB(A002);
            ((C23570Bly) this.A03).A03((Object) null);
            return;
        }
        int i = -1;
        try {
            C20121A8g a8g = (C20121A8g) this.A03;
            C18070vi.A0j(r7, a8g);
            C108945cZ.A1N(r7);
            C29621ca BVP = a8g.BVP();
            ? obj = new Object();
            AnonymousClass9DP r0 = (AnonymousClass9DP) obj.A03(r7, new C21290Ahb(BVP, C20117A8a.A00, 49), new String[0]);
            if (r0 != null) {
                i = (int) ((C122306Ot) r0.A00).A00;
                str2 = "Valid error code returned from server for serialized lookup";
                ((C132396mi) this.A02).A00(str, str2, i);
                return;
            }
            throw AnonymousClass1O9.A00(obj);
        } catch (AnonymousClass1UI unused) {
            str2 = "Couldn't parse the IQ error for serialized lookup.";
        } catch (NumberFormatException unused2) {
            str2 = "Couldn't parse the error code for serialized lookup.";
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r23v0, types: [X.CUp, java.lang.Object] */
    public void C7Z(C29621ca r30, String str) {
        AnonymousClass1UI r0;
        Integer num;
        AnonymousClass87K r02;
        int i;
        boolean z;
        int i2;
        Long l;
        C127326eA r3;
        Integer num2;
        String str2 = str;
        if (this.A00 != 0) {
            C17900vP.A0f("GdprXmppMethods/sendDeleteGdprReport/onSuccess; iq=", str2, AnonymousClass000.A10());
            C108945cZ.A1P(this.A04);
            ((C23570Bly) this.A03).A03((Object) null);
            return;
        }
        try {
            C20121A8g a8g = (C20121A8g) this.A03;
            C29621ca r9 = r30;
            C18070vi.A0e(r9, 1, a8g);
            C108945cZ.A1N(r9);
            C29621ca BVP = a8g.BVP();
            ? obj = new Object();
            C20117A8a a8a = C20117A8a.A00;
            if (obj.A03(r9, new C21160AfV(BVP, a8a, 1), new String[0]) != null) {
                ArrayList A08 = obj.A08(r9, C108945cZ.A0W(a8a, 1), new String[]{"single_serialized_proof"}, 1, 2);
                if (A08 != null) {
                    String[] strArr = (String[]) this.A04;
                    int length = strArr.length;
                    if (length != A08.size()) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("keytransparencyprotocolhelper/sendmultiserializedlookupiq Requested number of multi serialized lookups do not match the received proofs: ");
                        A10.append(length);
                        C17890vO.A14(" vs. ", A10, A08);
                        C17890vO.A19(A10, ". Parsing canceled.");
                        StringBuilder A102 = AnonymousClass000.A10();
                        C17890vO.A14("Server returned response has ", A102, A08);
                        A102.append(" proof response(s) whereas the request included ");
                        A102.append(length);
                        ((C132396mi) this.A02).A00(str2, AnonymousClass000.A0y(" label(s).", A102), -1);
                        return;
                    }
                    byte[][] bArr = new byte[length][];
                    byte[][] bArr2 = new byte[length][];
                    byte[][] bArr3 = new byte[length][];
                    int[] iArr = new int[length];
                    for (int i3 = 0; i3 < A08.size(); i3++) {
                        ((C1603888g) ((AnonymousClass9DO) A08.get(i3)).A00).BAS(new C130086ir(this, iArr, bArr, bArr2, bArr3, i3));
                    }
                    C132396mi r7 = (C132396mi) this.A02;
                    Arrays.toString(strArr);
                    int i4 = 0;
                    int i5 = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        int i7 = iArr[i6];
                        if (i7 != 0) {
                            if (i7 == 16792) {
                                i4++;
                            } else {
                                i5++;
                            }
                        }
                    }
                    if (i5 != 0) {
                        num = AnonymousClass00R.A0C;
                    } else if (i4 != 0) {
                        num = AnonymousClass00R.A01;
                    } else {
                        num = AnonymousClass00R.A00;
                    }
                    Integer num3 = AnonymousClass00R.A0C;
                    if (num == num3) {
                        Log.e("One of the proof requests returned error. Failing verification and returning a not found.");
                        r3 = r7.A00;
                        num2 = C124606Yz.A00;
                    } else if (num == AnonymousClass00R.A01) {
                        Log.e("One of the proof requests returned pending. Pending verification.");
                        r3 = r7.A00;
                        num2 = C124606Yz.A01;
                    } else {
                        HashMap A11 = C17880vN.A11();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                A11.size();
                                r02 = r7.A00.A00;
                                num3 = AnonymousClass00R.A00;
                                break;
                            }
                            byte[] bArr4 = bArr3[i8];
                            byte[] bArr5 = bArr[i8];
                            byte[] bArr6 = bArr2[i8];
                            C17970vW.A06(bArr5);
                            C139306yc r14 = r7.A01;
                            byte[] bArr7 = C139306yc.A09;
                            AnonymousClass11P r17 = r14.A00;
                            long A012 = AnonymousClass11P.A01(r17);
                            byte[] bytes = strArr[i8].getBytes();
                            byte[] bArr8 = r7.A02[i8];
                            if (bArr5 == null || bytes == null || bArr8 == null) {
                                i2 = -8;
                                z = false;
                            } else {
                                C125966by r03 = new C125966by((NativeHolder) JniBridge.jvidispatchOOOOO(4, bArr5, bytes, bArr4, bArr8));
                                JniBridge.getInstance();
                                i2 = (int) JniBridge.jvidispatchIIO(1, 57, r03.A00);
                                if (i2 == 0) {
                                    byte[] bArr9 = (byte[]) A11.get(bArr5);
                                    if (bArr9 == null || !Arrays.equals(bArr9, bArr6)) {
                                        byte[] bArr10 = C139306yc.A09;
                                        try {
                                            ? obj2 = new Object();
                                            int length2 = bArr6.length;
                                            int length3 = bArr5.length;
                                            int i9 = length2 + length3;
                                            byte[] bArr11 = new byte[i9];
                                            byte[] bArr12 = new byte[i9];
                                            System.arraycopy(bArr6, 0, bArr12, 0, length2);
                                            System.arraycopy(bArr5, 0, bArr12, length2, length3);
                                            i2 = -9;
                                            if (C25362CeN.A00(obj2, bArr11, bArr12, bArr10, (long) i9) == 0) {
                                                i = 0;
                                                A11.put(ByteBuffer.wrap(bArr5), bArr6);
                                            }
                                        } catch (C21577AmR | IllegalArgumentException e) {
                                            Log.e("keytransparencymanager/verifyEd25519Signature/exception.", e);
                                            i2 = -9;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    z = true;
                                }
                                z = false;
                            }
                            long A013 = AnonymousClass11P.A01(r17);
                            C127336eB r11 = (C127336eB) r14.A05.get();
                            Integer valueOf = Integer.valueOf(i);
                            Boolean valueOf2 = Boolean.valueOf(z);
                            Long valueOf3 = Long.valueOf(A012);
                            Long valueOf4 = Long.valueOf(A013);
                            if (C18020vd.A05(C18040vf.A02, r11.A00, 2966)) {
                                int i10 = 1;
                                if (valueOf == null || valueOf.intValue() == 0) {
                                    i10 = 2;
                                    if (C18070vi.A19(valueOf2, true)) {
                                        i10 = 0;
                                    }
                                }
                                Long l2 = null;
                                if (valueOf4 == null || valueOf3 == null || A012 > A013 || (l = C108945cZ.A1B(A013, A012)) == null || i10 != 0) {
                                    l = null;
                                }
                                C1182462s r1 = new C1182462s();
                                r1.A00 = 0;
                                r1.A02 = l;
                                r1.A01 = Integer.valueOf(i10);
                                if (valueOf != null) {
                                    l2 = C17890vO.A0N(valueOf);
                                }
                                r1.A03 = l2;
                                r11.A01.CC7(r1);
                            }
                            if (!z) {
                                Log.e("Proof verification failed. Returning failure.");
                                r02 = r7.A00.A00;
                                break;
                            }
                            i8++;
                        }
                        r02.BpN(num3);
                        return;
                    }
                    int intValue = num2.intValue();
                    r02 = r3.A00;
                    if (intValue == 16792) {
                        num3 = AnonymousClass00R.A01;
                    }
                    r02.BpN(num3);
                    return;
                }
                r0 = AnonymousClass1O9.A00(obj);
            } else {
                r0 = AnonymousClass1O9.A00(obj);
            }
            throw r0;
        } catch (AnonymousClass1UI e2) {
            ((C132396mi) this.A02).A00(str2, "IQ error encountered on client sending multi serialized lookup request (e.g., wrong SMAX in server response).", -1);
            e2.printStackTrace();
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
