package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.7Qx  reason: invalid class name and case insensitive filesystem */
public class C146867Qx implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C146867Qx(C55612g5 r2, C130136iw r3) {
        this.A00 = 5;
        this.A01 = r3;
        this.A03 = true;
        this.A02 = r2;
    }

    public void run() {
        String str;
        String str2;
        C59042lf r0;
        C59312m6 r02;
        String str3;
        C28931bI r1;
        int i;
        switch (this.A00) {
            case 0:
                VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = (VerticalSwipeDismissBehavior) this.A01;
                C26281Cwc cwc = verticalSwipeDismissBehavior.A03;
                if (cwc == null || !cwc.A0F()) {
                    E9X e9x = verticalSwipeDismissBehavior.A04;
                    if (e9x == null) {
                        return;
                    }
                    if (this.A03) {
                        e9x.Brt();
                        return;
                    } else {
                        e9x.C5M();
                        return;
                    }
                } else {
                    ((View) this.A02).postOnAnimation(this);
                    return;
                }
            case 1:
                AnonymousClass75M r3 = (AnonymousClass75M) this.A01;
                boolean z = this.A03;
                Location location = (Location) this.A02;
                if (r3.A0V == null || z) {
                    AnonymousClass75M.A05(location, r3, (String) null, Math.max((int) location.getAccuracy(), 100), true, !r3.A0j);
                    return;
                }
                return;
            case 2:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A01;
                AnonymousClass21V r2 = (AnonymousClass21V) this.A02;
                boolean z2 = this.A03;
                if (r2 != null && z2) {
                    MediaViewFragment.A0g(mediaViewFragment, r2, mediaViewFragment.A01, true);
                    return;
                }
                return;
            case 3:
                C34361kM r6 = (C34361kM) this.A01;
                DeviceJid[] deviceJidArr = (DeviceJid[]) this.A02;
                boolean z3 = this.A03;
                for (DeviceJid deviceJid : deviceJidArr) {
                    if (deviceJid.getDevice() != 0) {
                        r6.A04.A0B(deviceJid, z3);
                    }
                }
                return;
            case 4:
                ((C57562jH) this.A01).A00.notifyAllObservers(new AnonymousClass35W(5, this.A02, this.A03));
                return;
            case 5:
                C130136iw r22 = (C130136iw) this.A01;
                String A04 = ((C55612g5) this.A02).A02.A04();
                if (A04 != null) {
                    List list = r22.A04;
                    list.add(A04);
                    int size = list.size();
                    List list2 = r22.A05;
                    if (size == list2.size()) {
                        BrazilPayBloksActivity brazilPayBloksActivity = r22.A02;
                        String str4 = r22.A03;
                        C194839sN r12 = r22.A01;
                        ADT A042 = brazilPayBloksActivity.A09.A04();
                        if (A042 == null) {
                            BrazilPayBloksActivity.A0u(r12, brazilPayBloksActivity);
                            return;
                        }
                        String A002 = A042.A00.A00();
                        ArrayList A13 = AnonymousClass000.A13();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String A0v = C17880vN.A0v(it);
                            AnonymousClass1MD[] r23 = new AnonymousClass1MD[2];
                            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4, r23, 0);
                            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0v, r23, 1);
                            A13.add(new C29621ca("document", r23));
                        }
                        AnonymousClass1MD[] r32 = new AnonymousClass1MD[2];
                        C17880vN.A1Q("action", "document-upload-step-up-challenge", r32, 0);
                        C17880vN.A1Q("challenge_id", A002, r32, 1);
                        brazilPayBloksActivity.A0A.A0G(new C175428yh(brazilPayBloksActivity, (C33711jG) brazilPayBloksActivity.A0U.get(), brazilPayBloksActivity.A05, r12, brazilPayBloksActivity, 22), new C29621ca("account", r32, (C29621ca[]) A13.toArray(new C29621ca[0])), "set");
                        return;
                    }
                    BrazilPayBloksActivity.A0v(r22.A01, r22.A02, r22.A03, list2, list, r22.A00 + 1);
                    return;
                }
                BrazilPayBloksActivity.A0u(r22.A01, r22.A02);
                return;
            case 6:
                BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this.A01;
                AnonymousClass21K r33 = (AnonymousClass21K) this.A02;
                boolean z4 = this.A03;
                UserJid A0I = ((AnonymousClass206) r33).A0I();
                AnonymousClass8pI A003 = C62862s7.A00(brazilOrderDetailsActivity.A09, brazilOrderDetailsActivity.A05, A0I);
                if (z4) {
                    str3 = "active";
                } else {
                    str3 = "inactive";
                }
                if (A003 != null) {
                    String str5 = A003.A04;
                    if (str5 == null || !TextUtils.equals(str5, str3)) {
                        A003.A04 = str3;
                        C62862s7.A02(brazilOrderDetailsActivity.A09, brazilOrderDetailsActivity.A05, A0I, Boolean.valueOf(A003.A0F()), str3, (HashMap) null, (HashMap) null);
                        AnonymousClass8Gd r24 = brazilOrderDetailsActivity.A0C;
                        AnonymousClass205 r13 = brazilOrderDetailsActivity.A0J;
                        C20285AEt BPK = r33.BPK();
                        BPK.getClass();
                        r24.CQb(BPK.A02, r13, r33);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                AnonymousClass1FU r25 = (AnonymousClass1FU) this.A01;
                boolean z5 = this.A03;
                Runnable runnable = (Runnable) this.A02;
                if (z5) {
                    r25.CEx();
                }
                runnable.run();
                return;
            case 8:
                AnonymousClass933 r5 = (AnonymousClass933) this.A01;
                boolean z6 = this.A03;
                Object obj = this.A02;
                ArrayList A0B = r5.A04.A0B();
                r5.A0I = A0B;
                r5.A03 = AnonymousClass1KH.A02(A0B);
                r5.A05.A0J(new C146867Qx(r5, obj, 7, z6));
                return;
            case 9:
                IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity = (IndiaUpiVpaContactInfoActivity) this.A01;
                Object obj2 = this.A02;
                boolean z7 = this.A03;
                if (obj2 == null) {
                    IndiaUpiVpaContactInfoActivity.A0V(indiaUpiVpaContactInfoActivity, z7);
                    return;
                } else if (z7) {
                    indiaUpiVpaContactInfoActivity.BhQ(2131887203);
                    return;
                } else {
                    Object[] A1a = AnonymousClass3MW.A1a();
                    A1a[0] = indiaUpiVpaContactInfoActivity.getString(2131891337);
                    indiaUpiVpaContactInfoActivity.BhU(A1a, 0, 2131897291);
                    return;
                }
            case 10:
                boolean z8 = this.A03;
                Object obj3 = this.A02;
                C73203Rj A004 = AnonymousClass4a6.A00((Context) this.A01);
                int i2 = 2131894220;
                if (z8) {
                    i2 = 2131893903;
                }
                A004.A0E(i2);
                int i3 = 2131894198;
                if (z8) {
                    i3 = 2131893902;
                }
                A004.A0D(i3);
                AnonymousClass758.A00(A004, obj3, 10, 2131899286);
                AnonymousClass3MY.A1G(A004);
                return;
            case 11:
                Object obj4 = this.A02;
                boolean z9 = this.A03;
                DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) ((C95524mN) this.A01).A01;
                if (!devicePairQrScannerActivity.Bed() && (r02 = devicePairQrScannerActivity.A08.A00().A00) != null && r02.equals(obj4)) {
                    devicePairQrScannerActivity.BhQ(2131889984);
                    DevicePairQrScannerActivity.A03(devicePairQrScannerActivity);
                    devicePairQrScannerActivity.A0D.get();
                    devicePairQrScannerActivity.A06 = null;
                    BCS A005 = C138556xH.A00(devicePairQrScannerActivity);
                    int i4 = -16;
                    if (z9) {
                        i4 = -15;
                    }
                    A005.BiF(8, i4);
                    return;
                }
                return;
            case 12:
                C33841jT r8 = (C33841jT) this.A01;
                boolean z10 = this.A03;
                ((C30851ec) r8.A0L.get()).A01((C59242lz) this.A02);
                if (!r8.A02.A00 || !z10) {
                    Context context = r8.A0A.A00;
                    String string = context.getString(2131899103);
                    r8.A0B.BkR(52, C33841jT.A00(r8, string, C17880vN.A0q(context, string, new Object[1], 0, 2131893000), C17880vN.A0q(context, string, AnonymousClass3MX.A1b(string, 0), 1, 2131893001)).A05());
                    return;
                }
                Log.i("RegistrationManager/showDeviceConfirmationOverlayAlertOrNotify/App is no longer in background - skipping notification");
                return;
            case 13:
                List list3 = (List) this.A01;
                boolean z11 = this.A03;
                C133956pm r52 = (C133956pm) this.A02;
                ArrayList A16 = C108955ca.A16(list3, 0);
                LinkedHashSet A14 = C17880vN.A14();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1E7 A0O = C17880vN.A0O(it2);
                    if (!(A0O.A09 != 1 || (r0 = A0O.A0H) == null || r0.A01 == null)) {
                        A0O.A09 = 0;
                        if (z11) {
                            A0O.A01 = 2;
                        } else {
                            A0O.A01 = 0;
                            A16.add(A0O);
                        }
                        A14.add(A0O);
                    }
                }
                if (!A14.isEmpty()) {
                    AnonymousClass1M9 r03 = r52.A00;
                    if (r03 == null) {
                        C18070vi.A11("contactManager");
                        throw null;
                    }
                    r03.A0x(A14);
                }
                if (C17880vN.A1X(A16)) {
                    C139486yv r34 = r52.A01;
                    if (r34 == null) {
                        C18070vi.A11("nativeContactDbHelper");
                        throw null;
                    }
                    Iterator it3 = A16.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass1E7 A0O2 = C17880vN.A0O(it3);
                        C18070vi.A0d(A0O2, 0);
                        AnonymousClass1BI r14 = A0O2.A0J;
                        Long l = null;
                        if (r14 != null) {
                            String str6 = null;
                            String str7 = A0O2.A0T;
                            if (str7 != null) {
                                str6 = str7;
                            }
                            String str8 = A0O2.A0S;
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append('+');
                            String str9 = r14.user;
                            if (str9 != null) {
                                str2 = AnonymousClass1YE.A07(str9, "+", "", false);
                            } else {
                                str2 = "";
                            }
                            String A0y = AnonymousClass000.A0y(str2, A10);
                            C59042lf r04 = A0O2.A0H;
                            if (r04 != null) {
                                l = Long.valueOf(r04.A00);
                            }
                            r34.A01(new C136426tn(l, (String) null, (String) null, str6, str8, A0y, A0O2.A0Q, true), (C1606489j) null);
                        }
                    }
                }
                if (z11) {
                    Log.i("SettingsContactsUtil/backupTurningOffWithOSABOn/delete contacts");
                    AnonymousClass12E r05 = r52.A02;
                    if (r05 == null) {
                        C18070vi.A11("contactSyncMethods");
                        throw null;
                    } else {
                        r05.A0A();
                        return;
                    }
                } else {
                    return;
                }
            case 14:
                List list4 = (List) this.A01;
                C133956pm r82 = (C133956pm) this.A02;
                boolean z12 = this.A03;
                C18070vi.A0d(list4, 0);
                LinkedHashSet A142 = C17880vN.A14();
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    AnonymousClass1E7 A0O3 = C17880vN.A0O(it4);
                    C59042lf r06 = A0O3.A0H;
                    if (!(r06 == null || r06.A01 == null || A0O3.A01 == 2)) {
                        A0O3.A01 = 0;
                        A142.add(A0O3);
                    }
                }
                if (!A142.isEmpty()) {
                    AnonymousClass1M9 r07 = r82.A00;
                    if (r07 == null) {
                        str = "contactManager";
                    } else {
                        r07.A0x(A142);
                        str = "contactSyncMethods";
                        AnonymousClass12E r15 = r82.A02;
                        if (z12) {
                            if (r15 != null) {
                                r15.A0C(AnonymousClass00R.A0N);
                                return;
                            }
                        } else if (r15 != null) {
                            r15.A0A();
                            return;
                        }
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                return;
            case 15:
                C1407572w r35 = (C1407572w) this.A01;
                AnonymousClass21V r26 = (AnonymousClass21V) this.A02;
                int i5 = 0;
                if (this.A03) {
                    i5 = 6;
                }
                C1407572w.A01(r26, r35, i5);
                return;
            case 16:
                C37721q1 r4 = (C37721q1) this.A01;
                boolean z13 = this.A03;
                C23841Bqy bqy = (C23841Bqy) this.A02;
                C18070vi.A0d(bqy, 2);
                C37721q1.A01(bqy, r4, r4.A09, r4.A0A);
                bqy.A07 = Integer.valueOf(C72453Mb.A04(z13 ? 1 : 0));
                r4.A02.CC7(bqy);
                return;
            case 17:
                boolean z14 = this.A03;
                AnonymousClass3M2 r27 = (AnonymousClass3M2) this.A01;
                View view = (View) this.A02;
                BitmapFactory.Options options = C32021gV.A0E;
                if (z14) {
                    r27.CN4(view);
                    return;
                }
                return;
            case 18:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                CallInfo callInfo = (CallInfo) this.A02;
                boolean z15 = this.A03;
                C1408673j r36 = voipActivityV2.A17;
                String A006 = ((C191599mr) voipActivityV2.A0u.A3D.get()).A00(callInfo.callId);
                int i6 = 4;
                if (z15) {
                    i6 = 5;
                }
                if (!AnonymousClass3Ma.A1b(AnonymousClass3MW.A11(C1408673j.A05), i6)) {
                    String A1I = AnonymousClass001.A1I("Cannot start a session from subSurface:", AnonymousClass000.A10(), i6);
                    C17960vV.A0F(false, A1I);
                    Log.e(A1I);
                    return;
                }
                r36.A02.execute(new C70783Cm(r36, callInfo, A006, i6, 10));
                return;
            default:
                WebPagePreviewView webPagePreviewView = (WebPagePreviewView) this.A01;
                boolean z16 = this.A03;
                Bitmap bitmap = (Bitmap) this.A02;
                if (z16) {
                    BF3 bf3 = new BF3(webPagePreviewView.getResources(), bitmap);
                    bf3.A00();
                    ((ImageView) webPagePreviewView.A0R.A02()).setImageDrawable(bf3);
                    r1 = webPagePreviewView.A0R;
                    i = 0;
                } else {
                    r1 = webPagePreviewView.A0R;
                    i = 8;
                }
                r1.A04(i);
                return;
        }
    }

    public C146867Qx(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = obj2;
    }
}
