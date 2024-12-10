package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1PM  reason: invalid class name */
public class AnonymousClass1PM {
    public final AnonymousClass18O A00;
    public final C24671Lf A01;
    public final AnonymousClass1PO A02 = new AnonymousClass10T();
    public final AnonymousClass1PL A03;
    public final AnonymousClass1P3 A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final Object A07 = new Object();
    public final Map A08 = Collections.synchronizedMap(new HashMap());
    public final Handler A09 = new Handler(Looper.getMainLooper());
    public final AnonymousClass11S A0A;
    public final AnonymousClass1M9 A0B;
    public final Set A0C;

    public static boolean A00(AnonymousClass1PM r21, UserJid userJid, C42691ya r23, byte[] bArr, int i) {
        Object obj;
        String str;
        AnonymousClass00H r5;
        String str2;
        Long l;
        String str3;
        Integer num;
        C41851xA BD1;
        String str4;
        boolean z = false;
        UserJid userJid2 = userJid;
        if (userJid == null) {
            return false;
        }
        AnonymousClass1PM r3 = r21;
        try {
            AnonymousClass00H r22 = r3.A06;
            ((C60102nO) r22.get()).A01("validate_cert");
            C165038aU r1 = (C165038aU) C23577Bm6.A07(C165038aU.DEFAULT_INSTANCE, bArr);
            if ((r1.bitField0_ & 1) != 0) {
                C42691ya r6 = null;
                C165578bQ r8 = (C165578bQ) C23577Bm6.A07(C165578bQ.DEFAULT_INSTANCE, r1.details_.A06());
                if (r8 != null) {
                    ((C60102nO) r22.get()).A00("validate_cert");
                    synchronized (r3.A07) {
                        r3.A0B.A0H(userJid2);
                        C42741yf A022 = r3.A02(userJid2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("VerifiedNameManager/storeVerifiedNameCert, userjid: ");
                        sb.append(userJid2);
                        sb.append(", old serial: ");
                        if (A022 == null) {
                            l = null;
                        } else {
                            l = Long.valueOf(A022.A05);
                        }
                        sb.append(l);
                        sb.append(", issuer: ");
                        if (A022 == null) {
                            str3 = null;
                        } else {
                            str3 = A022.A07;
                        }
                        sb.append(str3);
                        sb.append(", vlevel: ");
                        if (A022 == null) {
                            num = null;
                        } else {
                            num = Integer.valueOf(A022.A03);
                        }
                        sb.append(num);
                        sb.append(", privacyState: ");
                        if (A022 != null) {
                            r6 = A022.A00();
                        }
                        sb.append(r6);
                        Log.i(sb.toString());
                        C42691ya r52 = r23;
                        int i2 = i;
                        if (A022 == null || A022.A05 != r8.serial_ || A022.A02 > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (C165028aT r7 : r8.localizedNames_) {
                                if (!TextUtils.isEmpty(r7.lg_)) {
                                    String str5 = r7.lg_;
                                    if (!TextUtils.isEmpty(r7.lc_)) {
                                        str4 = r7.lc_;
                                    } else {
                                        str4 = "";
                                    }
                                    arrayList.add(new C19760yx(new Locale(str5, str4), r7.verifiedName_));
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("VerifiedNameManager/storeVerifiedNameCert, new or updated cert. jid: ");
                            sb2.append(userJid2);
                            sb2.append("new serial:");
                            sb2.append(r8.serial_);
                            sb2.append(", issuer: ");
                            sb2.append(r8.issuer_);
                            sb2.append(", vlevel: ");
                            sb2.append(i2);
                            sb2.append(", privacyState: ");
                            sb2.append(r52);
                            Log.i(sb2.toString());
                            ((C60102nO) r22.get()).A01("save_cert");
                            AnonymousClass1PL r72 = r3.A03;
                            long j = r8.serial_;
                            String str6 = r8.issuer_;
                            String str7 = r8.verifiedName_;
                            try {
                                C28791au A062 = r72.A00.A06();
                                try {
                                    BD1 = A062.BD1();
                                    UserJid A002 = r72.A01.A00(userJid2);
                                    AnonymousClass1PL.A04(r72, BD1, A002);
                                    String A063 = C22971Dz.A06(A002);
                                    boolean z2 = false;
                                    int i3 = 7;
                                    if (r52 != null) {
                                        z2 = true;
                                        i3 = 10;
                                    }
                                    ContentValues contentValues = new ContentValues(i3);
                                    contentValues.put("jid", A063);
                                    contentValues.put("serial", Long.valueOf(j));
                                    contentValues.put("issuer", str6);
                                    contentValues.put("verified_name", str7);
                                    contentValues.put("verified_level", Integer.valueOf(i2));
                                    contentValues.put("cert_blob", (byte[]) null);
                                    contentValues.put("identity_unconfirmed_since", (Long) null);
                                    if (z2) {
                                        contentValues.put("host_storage", Integer.valueOf(r52.hostStorage));
                                        contentValues.put("actual_actors", Integer.valueOf(r52.actualActors));
                                        contentValues.put("privacy_mode_ts", Long.valueOf(r52.privacyModeTs));
                                    }
                                    C24861Ly.A00(contentValues, A062, "wa_vnames");
                                    contentValues.clear();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        C19760yx r53 = (C19760yx) it.next();
                                        contentValues.put("jid", A063);
                                        Locale locale = (Locale) r53.A00;
                                        C17960vV.A07(locale);
                                        contentValues.put("lg", locale.getLanguage());
                                        contentValues.put("lc", locale.getCountry());
                                        contentValues.put("verified_name", (String) r53.A01);
                                        C24861Ly.A00(contentValues, A062, "wa_vnames_localized");
                                    }
                                    ArrayList A0N = r72.A00.A0N(A002);
                                    BD1.A00();
                                    BD1.close();
                                    A062.close();
                                    if (A0N != null && !A0N.isEmpty()) {
                                        AnonymousClass35V.A00((C47812Kb) r72.A02.get(), A0N, 5);
                                    }
                                    ((C60102nO) r22.get()).A00("save_cert");
                                    ((C60102nO) r22.get()).A04(true);
                                    z = true;
                                } catch (Throwable th) {
                                    A062.close();
                                    throw th;
                                }
                            } catch (IllegalArgumentException e) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("contact-mgr-db/unable to store vname details ");
                                sb3.append(userJid2);
                                C17960vV.A09(sb3.toString(), e);
                            } catch (Throwable th2) {
                                AnonymousClass0DT.A00(th, th2);
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("VerifiedNameManager/storeVerifiedNameCert, cert unchanged but level or privacy changed, jid: ");
                            sb4.append(userJid2);
                            Log.i(sb4.toString());
                            z = r3.A05(userJid2, r52, i2, false);
                        }
                    }
                    r3.A08.put(userJid2, Long.valueOf(System.currentTimeMillis()));
                    r3.A02.notifyAllObservers(new C20723AWd(new C189389jA(userJid2), 14));
                    return z;
                }
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("VerifiedNameManager/storeVerifiedNameCert, vname certificate details could no be found or validated for jid ");
            sb5.append(userJid2);
            Log.w(sb5.toString());
            ((C60102nO) r22.get()).A03("error_reason", "invalid_certificate");
            ((C60102nO) r22.get()).A00("validate_cert");
            obj = r22.get();
        } catch (AnonymousClass1PN e2) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("VerifiedNameManager/storeVerifiedNameCert, vname invalidproto for jid: ");
            sb6.append(userJid2);
            Log.e(sb6.toString(), e2);
            r5 = r3.A06;
            str = "error_reason";
            ((C60102nO) r5.get()).A03(str, "invalid_proto");
            str2 = "validate_cert";
            ((C60102nO) r5.get()).A00(str2);
            ((C60102nO) r5.get()).A04(false);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("VerifiedNameManager/storeVerifiedNameCert, vname certificate details could no be found or validated for jid ");
            sb7.append(userJid2);
            Log.w(sb7.toString());
            ((C60102nO) r5.get()).A03(str, "invalid_certificate");
            ((C60102nO) r5.get()).A00(str2);
            obj = r5.get();
            ((C60102nO) obj).A04(false);
            r3.A08.put(userJid2, Long.valueOf(System.currentTimeMillis()));
            r3.A02.notifyAllObservers(new C20723AWd(new C189389jA(userJid2), 14));
            return z;
        } catch (IllegalArgumentException e3) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("VerifiedNameManager/storeVerifiedNameCert vname failed to get identity entry for jid = ");
            sb8.append(userJid2);
            Log.e(sb8.toString(), e3);
            r5 = r3.A06;
            str = "error_reason";
            ((C60102nO) r5.get()).A03(str, "invalid_proto");
            str2 = "validate_cert";
            ((C60102nO) r5.get()).A00(str2);
            ((C60102nO) r5.get()).A04(false);
            StringBuilder sb72 = new StringBuilder();
            sb72.append("VerifiedNameManager/storeVerifiedNameCert, vname certificate details could no be found or validated for jid ");
            sb72.append(userJid2);
            Log.w(sb72.toString());
            ((C60102nO) r5.get()).A03(str, "invalid_certificate");
            ((C60102nO) r5.get()).A00(str2);
            obj = r5.get();
            ((C60102nO) obj).A04(false);
            r3.A08.put(userJid2, Long.valueOf(System.currentTimeMillis()));
            r3.A02.notifyAllObservers(new C20723AWd(new C189389jA(userJid2), 14));
            return z;
        } catch (Throwable th3) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("VerifiedNameManager/storeVerifiedNameCert, vname certificate details could no be found or validated for jid ");
            sb9.append(userJid2);
            Log.w(sb9.toString());
            AnonymousClass00H r54 = r3.A06;
            ((C60102nO) r54.get()).A03("error_reason", "invalid_certificate");
            ((C60102nO) r54.get()).A00("validate_cert");
            ((C60102nO) r54.get()).A04(false);
            r3.A08.put(userJid2, Long.valueOf(System.currentTimeMillis()));
            r3.A02.notifyAllObservers(new C20723AWd(new C189389jA(userJid2), 14));
            throw th3;
        }
        ((C60102nO) obj).A04(false);
        r3.A08.put(userJid2, Long.valueOf(System.currentTimeMillis()));
        r3.A02.notifyAllObservers(new C20723AWd(new C189389jA(userJid2), 14));
        return z;
        throw th;
    }

    @Deprecated
    public C42741yf A02(UserJid userJid) {
        Integer num = null;
        C42741yf A012 = A01(userJid);
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedNameManager/getVerifiedNameDeprecated, jid: ");
        sb.append(userJid);
        sb.append(", vlevel:");
        if (A012 != null) {
            num = Integer.valueOf(A012.A03);
        }
        sb.append(num);
        Log.i(sb.toString());
        return A012;
    }

    public C42741yf A01(UserJid userJid) {
        if (this.A0A.A0O(userJid)) {
            return this.A03.A0I(userJid);
        }
        if (userJid != null) {
            return this.A0B.A0H(userJid).A0G;
        }
        return null;
    }

    public void A03(UserJid userJid) {
        C41851xA BD0;
        ArrayList A0N;
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedNameManager/clearVerifiedName, userjid: ");
        sb.append(userJid);
        sb.append(" UI change");
        Log.i(sb.toString());
        synchronized (this.A07) {
            AnonymousClass1PL r5 = this.A03;
            if (userJid != null) {
                try {
                    C28791au A062 = r5.A00.A06();
                    try {
                        BD0 = A062.BD0();
                        AnonymousClass1PL.A04(r5, BD0, userJid);
                        A0N = r5.A00.A0N(userJid);
                        BD0.A00();
                        BD0.close();
                        A062.close();
                    } catch (Throwable th) {
                        A062.close();
                        throw th;
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("contact-mgr-db/unable to delete vname details ");
                    sb2.append(userJid);
                    C17960vV.A09(sb2.toString(), e);
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                if (A0N != null && !A0N.isEmpty()) {
                    AnonymousClass35V.A00((C47812Kb) r5.A02.get(), A0N, 5);
                }
            }
        }
        this.A08.remove(userJid);
        this.A0B.A0S();
        this.A09.post(new C70623Bv(this, userJid, 35));
        return;
        throw th;
    }

    public boolean A04(UserJid userJid) {
        AnonymousClass1E7 A0E;
        String str;
        if (userJid == null || (A0E = this.A0B.A0E(userJid)) == null || (str = A0E.A0V) == null || !str.startsWith("ent:")) {
            return false;
        }
        return true;
    }

    public boolean A05(UserJid userJid, C42691ya r21, int i, boolean z) {
        Object obj;
        int i2;
        long j;
        boolean z2;
        C28791au A062;
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedNameManager/updateContactBizField, userjid: ");
        UserJid userJid2 = userJid;
        sb.append(userJid2);
        sb.append("new verifiedLevel: ");
        int i3 = i;
        sb.append(i3);
        sb.append(" privacyMode: ");
        C42691ya r11 = r21;
        if (r21 == null) {
            obj = "null";
        } else {
            obj = r11;
        }
        sb.append(obj);
        Log.i(sb.toString());
        synchronized (this.A07) {
            C42741yf A022 = A02(userJid2);
            if (A022 != null) {
                i2 = A022.A03;
            } else {
                i2 = 0;
            }
            if (A022 != null) {
                j = A022.A04;
            } else {
                j = 0;
            }
            ContentValues contentValues = new ContentValues();
            if (i2 != i3) {
                ((C60102nO) this.A06.get()).A03("change_reason", "vlevel_change");
                contentValues.put("verified_level", Integer.valueOf(i3));
            }
            if (r21 != null) {
                long j2 = r11.privacyModeTs;
                if (j < j2 || (j > 0 && j2 == 0)) {
                    contentValues.put("host_storage", Integer.valueOf(r11.hostStorage));
                    contentValues.put("actual_actors", Integer.valueOf(r11.actualActors));
                    contentValues.put("privacy_mode_ts", Long.valueOf(r11.privacyModeTs));
                }
            }
            z2 = false;
            if (contentValues.size() > 0) {
                z2 = true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("VerifiedNameManager/updateContactBizField, userjid: ");
            sb2.append(userJid2);
            sb2.append(", isUpdate: ");
            sb2.append(z2);
            Log.i(sb2.toString());
            if (z2) {
                AnonymousClass00H r18 = this.A06;
                ((C60102nO) r18.get()).A01("update_biz_field");
                AnonymousClass1PL r112 = this.A03;
                UserJid A002 = r112.A01.A00(userJid2);
                try {
                    A062 = r112.A00.A06();
                    C24861Ly.A01(contentValues, A062, "wa_vnames", "jid = ?", new String[]{C22971Dz.A06(A002)});
                    A062.close();
                } catch (IllegalArgumentException e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("wadbhelper/update-multi-fields/unable to update fields");
                    sb3.append(userJid2);
                    sb3.append(", ");
                    sb3.append(contentValues.toString());
                    C17960vV.A09(sb3.toString(), e);
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
                AnonymousClass35V.A00((C47812Kb) r112.A02.get(), r112.A00.A0N(A002), 5);
                ((C60102nO) r18.get()).A00("update_biz_field");
                if (z && i2 != i3) {
                    this.A0B.A0S();
                    Iterator it = this.A0C.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw new NullPointerException("onLevelChanged");
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("VerifiedNameManager/updateContactBizField, ui change, userjid: ");
                sb4.append(userJid2);
                Log.i(sb4.toString());
                if (userJid != null) {
                    this.A09.post(new C70623Bv(this, userJid2, 37));
                }
            }
            ((C60102nO) this.A06.get()).A04(true);
        }
        return z2;
        throw th;
    }

    public boolean A06(UserJid userJid, C42691ya r7, byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedNameManager/storeAndConfirmVerifiedNameCert, jid: ");
        sb.append(userJid);
        sb.append(", new vlevel: ");
        sb.append(i);
        Log.i(sb.toString());
        synchronized (this.A07) {
            A00(this, userJid, r7, bArr, i);
            C42741yf A022 = A02(userJid);
            C17960vV.A07(A022);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("VerifiedNameManager/storeAndConfirmVerifiedNameCert, jid: ");
            sb2.append(userJid);
            sb2.append(", verifiedName.identityUnconfirmedSince: ");
            int i2 = A022.A02;
            sb2.append(i2);
            Log.i(sb2.toString());
            if (i2 != 0) {
                return false;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("VerifiedNameManager/storeAndConfirmVerifiedNameCert, updating UI, userjid: ");
            sb3.append(userJid);
            Log.i(sb3.toString());
            this.A09.post(new C70623Bv(this, userJid, 36));
            return true;
        }
    }

    public byte[] A07(UserJid userJid) {
        Cursor A032;
        AnonymousClass1PL r1 = this.A03;
        C28781at A052 = r1.A00.get();
        try {
            A032 = C24861Ly.A03(A052, "SELECT cert_blob FROM wa_vnames WHERE jid = ?", "CONTACT_VNAMES_CERT_BLOB", new String[]{r1.A01.A00(userJid).getRawString()});
            if (A032.isClosed() || !A032.moveToNext()) {
                A032.close();
                A052.close();
                return null;
            }
            byte[] blob = A032.getBlob(A032.getColumnIndexOrThrow("cert_blob"));
            A032.close();
            A052.close();
            return blob;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.10T, X.1PO] */
    public AnonymousClass1PM(AnonymousClass11S r3, AnonymousClass18O r4, AnonymousClass1M9 r5, C24671Lf r6, AnonymousClass1PL r7, AnonymousClass1P3 r8, AnonymousClass00H r9, AnonymousClass00H r10, Set set) {
        this.A0A = r3;
        this.A00 = r4;
        this.A0B = r5;
        this.A05 = r9;
        this.A01 = r6;
        this.A04 = r8;
        this.A03 = r7;
        this.A06 = r10;
        this.A0C = set;
    }
}
