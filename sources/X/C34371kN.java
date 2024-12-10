package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1kN  reason: invalid class name and case insensitive filesystem */
public final class C34371kN implements AnonymousClass1RJ {
    public final AnonymousClass120 A00;
    public final C32501hI A01;
    public final C19830z4 A02;
    public final AnonymousClass1P3 A03;
    public final C25571Os A04;
    public final C34361kM A05;
    public final AnonymousClass10I A06;

    public int[] BSG() {
        return new int[]{74, 75, 76, 77, 78, 196, 82, 83, 84};
    }

    public boolean BcT(Message message, int i) {
        int A002;
        AnonymousClass10I r2;
        int i2;
        AnonymousClass10I r4;
        Runnable runnable;
        Jid[] jidArr;
        Object[] objArr;
        Message message2 = message;
        if (i != 196) {
            switch (i) {
                case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                    List list = (List) message2.obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append("RecvPreKeyMessageListener/onGetPreKeySuccess Schedule processing of prekeys. Count = ");
                    sb.append(list.size());
                    Log.i(sb.toString());
                    C32501hI r9 = this.A01;
                    synchronized (r9) {
                        A002 = C18020vd.A00(C18040vf.A01, r9.A05, 767);
                    }
                    if (A002 <= 0 || list.size() < A002) {
                        r2 = this.A06;
                        i2 = 44;
                    } else {
                        r2 = this.A06;
                        i2 = 43;
                    }
                    r2.CGN(new C70643By(this, list, i2));
                    return true;
                case C166418cr.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                    Jid A022 = Jid.Companion.A02(((BaseBundle) message2.obj).getString("jid"));
                    C17960vV.A07(A022);
                    r4 = this.A06;
                    runnable = new C70643By(this, A022, 42);
                    break;
                case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                    BaseBundle baseBundle = (BaseBundle) message2.obj;
                    String[] stringArray = baseBundle.getStringArray("jids");
                    if (stringArray == null) {
                        jidArr = null;
                    } else {
                        List asList = Arrays.asList(stringArray);
                        ArrayList arrayList = new ArrayList(stringArray.length);
                        C22971Dz.A0I(asList, arrayList);
                        jidArr = (Jid[]) arrayList.toArray(new Jid[0]);
                    }
                    C17960vV.A07(jidArr);
                    int length = jidArr.length;
                    DeviceJid[] deviceJidArr = new DeviceJid[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        deviceJidArr[i3] = DeviceJid.Companion.A02(jidArr[i3]);
                    }
                    C34361kM r8 = this.A05;
                    int i4 = baseBundle.getInt("errorCode");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("prekey request failed; jid=");
                    sb2.append(Arrays.toString(deviceJidArr));
                    sb2.append("; errorCode=");
                    sb2.append(i4);
                    Log.i(sb2.toString());
                    C32501hI r92 = r8.A02;
                    synchronized (r92) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("prekeysmanager/onGetPreKeyError ");
                        sb3.append(Arrays.toString(deviceJidArr));
                        Log.e(sb3.toString());
                        for (int i5 = 0; i5 < length; i5++) {
                            DeviceJid deviceJid = deviceJidArr[i5];
                            C55182fM r1 = (C55182fM) r92.A08.remove(deviceJid);
                            if (500 <= i4 && i4 < 600 && r1 != null) {
                                r92.A09.put(deviceJid, r1);
                            }
                        }
                        if (500 <= i4 && i4 < 600 && (!r92.A01 || (!r92.A00 && r92.A08.isEmpty()))) {
                            r92.A01 = true;
                            r92.A00 = true;
                            r92.A02.postDelayed(new C70603Bt(r92, 31), r92.A07.A01() * 1000);
                        }
                    }
                    boolean z = false;
                    if (i4 == 406) {
                        z = true;
                    }
                    r4 = r8.A05;
                    runnable = new C146867Qx(r8, deviceJidArr, 3, z);
                    break;
                case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                    AnonymousClass120 r93 = this.A00;
                    synchronized (r93) {
                        r93.notifyAllObservers(new C20735AWq(0));
                        C54492eE[] r5 = r93.A03;
                        r93.A03 = null;
                        if (r93.A07.A0N() && r93.A09.A2X()) {
                            C31301fL.A00(r93.A08, 5, 0);
                        }
                        if (r93.A0A.A0Y()) {
                            r93.A0D.CGF(new C70713Cf(r93, r5, 44));
                        } else {
                            ((C25581Ot) r93.A0F.get()).A02(new C70713Cf(r93, r5, 45));
                        }
                        AnonymousClass120.A00(r93);
                    }
                    return true;
                case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                    BaseBundle baseBundle2 = (BaseBundle) message2.obj;
                    int i6 = baseBundle2.getInt("errorCode");
                    String string = baseBundle2.getString("errorText");
                    AnonymousClass120 r7 = this.A00;
                    synchronized (r7) {
                        r7.notifyAllObservers(new C20726AWg(i6, string, 0));
                        r7.A03 = null;
                        AnonymousClass120.A01(r7, 0);
                        if (r7.A07.A0N() && r7.A09.A2X()) {
                            C31301fL.A00(r7.A08, 4, (long) i6);
                        }
                        if (i6 == 406) {
                            Log.e("MyPreKeysManager/setPreKeyError failed to set prekeys; regenerating keys; errorCode=406");
                            if (r7.A0A.A0Y()) {
                                r7.A0D.CGF(new C70603Bt(r7, 27));
                            } else {
                                ((C25581Ot) r7.A0F.get()).A02(new C70603Bt(r7, 27));
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("MyPreKeysManager/setPreKeyError failed to set prekeys; will try again on next xmpp connect; errorCode=");
                            sb4.append(i6);
                            Log.e(sb4.toString());
                            if (i6 >= 500 && i6 < 600) {
                                r7.A02 = true;
                                r7.A06.A0K(new C70603Bt(r7, 28), r7.A0C.A01() * 1000);
                            }
                        }
                    }
                    return true;
                default:
                    switch (i) {
                        case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                            Bundle bundle = (Bundle) message2.obj;
                            byte[] byteArray = bundle.getByteArray("registration");
                            byte b = bundle.getByte(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            byte[] byteArray2 = bundle.getByteArray("signedKeyId");
                            Object[] objArr2 = (Object[]) bundle.getSerializable("keyIds");
                            if (objArr2 == null) {
                                objArr = null;
                            } else {
                                int length2 = objArr2.length;
                                objArr = new byte[length2][];
                                for (int i7 = 0; i7 < length2; i7++) {
                                    objArr[i7] = objArr2[i7];
                                }
                            }
                            byte[] byteArray3 = bundle.getByteArray("hash");
                            Log.i("RecvPreKeyMessageListener/onGetPreKeyDigest checking prekey digest");
                            this.A00.A05();
                            this.A06.CGF(new C70763Ck(this, objArr, byteArray, byteArray3, byteArray2, b, 3));
                            return true;
                        case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER /*83*/:
                            Log.i("RecvPreKeyMessageListener/onGetPreKeyDigestNone prekey digest none");
                            this.A00.A05();
                            r4 = this.A06;
                            runnable = new C70593Bs(this, 17);
                            break;
                        case 84:
                            Log.i("RecvPreKeyMessageListener/onGetPreKeyDigestServerError prekey digest server error");
                            this.A00.A05();
                            return true;
                        default:
                            return false;
                    }
            }
            r4.CGF(runnable);
            return true;
        }
        BaseBundle baseBundle3 = (BaseBundle) message2.obj;
        baseBundle3.getInt("errorCode");
        baseBundle3.getString("errorText");
        synchronized (this.A00) {
        }
        return true;
    }

    public C34371kN(AnonymousClass120 r1, C32501hI r2, C19830z4 r3, AnonymousClass1P3 r4, C25571Os r5, C34361kM r6, AnonymousClass10I r7) {
        this.A06 = r7;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
    }
}
