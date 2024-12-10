package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.community.LinkExistingGroupsUseCase$linkExistingGroups$1;
import com.whatsapp.community.LinkExistingGroupsUseCase$suggestExistingGroups$1;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.Ak4  reason: case insensitive filesystem */
public class C21437Ak4 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C21437Ak4(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = z;
        this.A04 = obj4;
    }

    public final void run() {
        C23691Hg aWq;
        String str;
        String A0q;
        Collection A0M;
        AnonymousClass1DT r1;
        Object obj;
        String str2;
        C20277AEk aEk;
        C20253ADl aDl;
        long j;
        long j2;
        long j3;
        switch (this.A00) {
            case 0:
                C26810DEs dEs = (C26810DEs) this.A01;
                List list = (List) this.A02;
                Exception exc = (Exception) this.A03;
                boolean z = this.A05;
                UUID uuid = (UUID) this.A04;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C26379Cyf.A07(exc, ((CJP) list.get(i)).A00.A0g.A00);
                }
                if (z) {
                    dEs.A0R.A05(uuid);
                    dEs.BIp((C6E) null);
                    return;
                }
                return;
            case 1:
                C26809DEr dEr = (C26809DEr) this.A01;
                List list2 = (List) this.A02;
                Exception exc2 = (Exception) this.A03;
                UUID uuid2 = (UUID) this.A04;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C26379Cyf.A07(exc2, ((CJP) list2.get(i2)).A00.A0g.A00);
                }
                dEr.A0a.A05(uuid2);
                dEr.BIp((C6E) null);
                return;
            case 2:
                Context context = (Context) this.A03;
                boolean z2 = this.A05;
                ((FirebaseInstanceIdReceiver) this.A01).A00((BroadcastReceiver.PendingResult) this.A04, context, (Intent) this.A02, z2);
                return;
            case 3:
                C188789hz r11 = (C188789hz) this.A01;
                AnonymousClass8g6 r2 = (AnonymousClass8g6) this.A02;
                Map map = (Map) this.A03;
                boolean z3 = this.A05;
                C58582kv r23 = (C58582kv) this.A04;
                AnonymousClass1Ez r0 = new AnonymousClass1Ez("restore>BackupApiBackupSelector/download-size-calc");
                try {
                    C20007A2x a2x = r2.A01;
                    AtomicBoolean atomicBoolean = r11.A0J;
                    JSONObject jSONObject = a2x.A0A;
                    long j4 = -1;
                    if (jSONObject != null) {
                        j4 = jSONObject.optLong("chatdbSize", -1);
                    }
                    if (z3) {
                        j = j4;
                    } else {
                        j = 0;
                    }
                    boolean z4 = false;
                    if (j > 0) {
                        r23.A01(false);
                    }
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("restore>BackupApiBackupSelector/calc-approx-total-download total size:");
                    long j5 = a2x.A04;
                    A10.append(j5);
                    A10.append(" dbSize: ");
                    A10.append(j4);
                    C17900vP.A0n(" includeDbSize: ", A10, z3);
                    if (j5 < 0) {
                        Log.e("restore>BackupApiBackupSelector/calc-approx-total-download totalSize is negative.");
                    }
                    if (j4 < 0) {
                        Log.e("restore>BackupApiBackupSelector/calc-approx-total-download dbSize is negative.");
                    }
                    long j6 = j5 - j4;
                    C218617r r26 = r11.A00;
                    if (r26.A0J().exists()) {
                        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                        int i3 = 20;
                        if (map.size() < 10) {
                            i3 = 1;
                        }
                        int i4 = 0;
                        long j7 = 0;
                        long j8 = 0;
                        while (true) {
                            if (i4 < strArr.length) {
                                if (atomicBoolean.get()) {
                                    Log.i("restore>BackupApiBackupSelector/calc-approx-media-download-size/interrupted");
                                    j6 = -1;
                                } else {
                                    String str3 = strArr[i4];
                                    if (str3 == null) {
                                        Log.e("restore>BackupApiBackupSelector/calc-approx-media-download-size file upload path is null, unexpected.");
                                    } else {
                                        AnonymousClass1L7 r02 = r11.A08;
                                        AnonymousClass1L7 r13 = r02;
                                        String A07 = C41361wE.A07(r02, str3);
                                        if (A07 == null) {
                                            C17900vP.A0f("restore>BackupApiBackupSelector/calc-approx-media-download-size/no-local-path-mapping ", str3, AnonymousClass000.A10());
                                        } else {
                                            Object obj2 = map.get(str3);
                                            C17960vV.A07(obj2);
                                            C19990A2d a2d = (C19990A2d) obj2;
                                            File A17 = C108945cZ.A17(A07);
                                            AnonymousClass00H r03 = C20134A8u.A00;
                                            try {
                                                if (r26.A0l(A17)) {
                                                    if (!A17.exists() || A17.length() == 0) {
                                                        j3 = a2d.A00;
                                                        j8 += j3;
                                                    } else if (!z3) {
                                                        j8 += a2d.A00;
                                                    } else if (i4 % i3 == 0) {
                                                        j3 = a2d.A00;
                                                        j8 += j3;
                                                        if (C20127A8m.A00(r11.A02, a2d, r13, A07) == 4) {
                                                        }
                                                    }
                                                    j7 += j3;
                                                    r23.A01(false);
                                                }
                                            } catch (IOException e) {
                                                C108995ce.A1J(A17, "gdrive-util/in-media-folder ", AnonymousClass000.A10(), e);
                                            }
                                        }
                                    }
                                    i4++;
                                }
                            } else if (j8 == 0) {
                                if (j7 > 0) {
                                    StringBuilder A102 = AnonymousClass000.A10();
                                    A102.append("restore>BackupApiBackupSelector/calc-approx-media-download unexpected situation, how can toBeDownloadedSampleSize=");
                                    A102.append(j7);
                                    C17900vP.A0l(" be greater than totalSampleSize=", A102, j8);
                                }
                                j6 = 0;
                            } else {
                                j6 = (long) (((((double) j7) * 1.0d) / ((double) j8)) * ((double) j6));
                            }
                        }
                    }
                    long j9 = j + j6;
                    if (j9 == 0) {
                        z4 = true;
                    }
                    r23.A01(Boolean.valueOf(z4));
                    if (z3) {
                        j2 = a2x.A01();
                    } else {
                        j2 = j9;
                    }
                    RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r11.A0I.get();
                    if (restoreFromBackupActivity != null) {
                        restoreFromBackupActivity.A4i(j9, j2);
                    }
                } catch (AnonymousClass9LZ e2) {
                    Log.e((Throwable) e2);
                }
                r0.A02();
                return;
            case 4:
                A2A a2a = (A2A) this.A01;
                Object obj3 = this.A03;
                Number number = (Number) this.A04;
                boolean z5 = this.A05;
                C18070vi.A0d(number, 3);
                AnonymousClass1R3 r7 = a2a.A02;
                Iterator it = AnonymousClass1R3.A01(C199410f.of(), r7, (AnonymousClass1BI) this.A02, 10, false, true).iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    if (!C18070vi.A18(A0Y.A0v, obj3) && AnonymousClass25A.A0e(A0Y) && (A0Y instanceof AnonymousClass21L)) {
                        AnonymousClass21L r6 = (AnonymousClass21L) A0Y;
                        if (a2a.A02(r6)) {
                            continue;
                        } else {
                            int intValue = number.intValue();
                            if (intValue == 0) {
                                AnonymousClass9IT r12 = null;
                                if (r6 != null) {
                                    A2Y A012 = a2a.A01(r6);
                                    if (A012 != null) {
                                        r12 = A012.A00;
                                    }
                                    if (r12 != AnonymousClass9IT.YES) {
                                    }
                                }
                            } else if (intValue != 1) {
                                throw AnonymousClass3MW.A14();
                            } else if (!z5) {
                                AnonymousClass9IT r14 = null;
                                if (r6 != null) {
                                    A2Y A013 = a2a.A01(r6);
                                    if (A013 != null) {
                                        r14 = A013.A00;
                                    }
                                    if (r14 == AnonymousClass9IT.YES) {
                                    }
                                }
                            } else if (a2a.A03(r6, AnonymousClass00R.A00)) {
                            }
                            C20271AEe A002 = A2A.A00(r6);
                            if (A002 != null) {
                                JSONObject A16 = C17880vN.A16(A002.A00);
                                if (intValue != 0) {
                                    str2 = "EXPIRED";
                                } else {
                                    str2 = "CALL_COMPLETED";
                                }
                                A16.put("status", str2);
                                C20285AEt aEt = r6.A00;
                                if (!(aEt == null || (aEk = aEt.A06) == null || (aDl = (C20253ADl) C29431cG.A0c(aEk.A03)) == null)) {
                                    aDl.A01.A00 = A16.toString();
                                }
                                a2a.A01.CQw(r6);
                            }
                        }
                    }
                }
                return;
            case 5:
                AnonymousClass3Uc r22 = (AnonymousClass3Uc) this.A01;
                boolean z6 = this.A05;
                AnonymousClass1EC r5 = (AnonymousClass1EC) this.A02;
                List list3 = (List) this.A03;
                List list4 = (List) this.A04;
                C87834Xg r4 = r22.A0Q;
                AnonymousClass1OX r04 = r22.A1A;
                C72473Md.A1I(r5, list4);
                C18560wh coroutineContext = r04.getCoroutineContext();
                if (z6) {
                    Object obj4 = (C83164Eb) AnonymousClass4GT.A00(coroutineContext, new LinkExistingGroupsUseCase$suggestExistingGroups$1(r4, r5, list3, list4, (C30391dr) null));
                    if (obj4 instanceof AnonymousClass41C) {
                        r1 = r22.A0I;
                        obj = obj4;
                    } else if (obj4 instanceof AnonymousClass41B) {
                        r1 = r22.A0H;
                        obj = Integer.valueOf(((AnonymousClass41B) obj4).A00);
                    } else {
                        return;
                    }
                } else {
                    Object obj5 = (C83164Eb) AnonymousClass4GT.A00(coroutineContext, new LinkExistingGroupsUseCase$linkExistingGroups$1(r4, r5, list3, list4, (C30391dr) null));
                    if (obj5 instanceof AnonymousClass41D) {
                        r1 = r22.A0G;
                        obj = obj5;
                    } else if (!(obj5 instanceof AnonymousClass41A) || ((AnonymousClass41A) obj5).A00 != 429) {
                        boolean z7 = obj5 instanceof AnonymousClass41B;
                        AnonymousClass1DT r05 = r22.A0G;
                        if (z7) {
                            r05.A0E((Object) null);
                            r1 = r22.A0H;
                            obj = Integer.valueOf(((AnonymousClass41B) obj5).A00);
                        } else {
                            r05.A0E((Object) null);
                            return;
                        }
                    } else {
                        AnonymousClass3MX.A1K(r22.A0H, 2131896803);
                        return;
                    }
                }
                r1.A0E(obj);
                return;
            case 6:
                boolean z8 = this.A05;
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A01;
                View view = (View) this.A02;
                List list5 = (List) this.A03;
                C74283Zf r24 = (C74283Zf) this.A04;
                List list6 = C42011xT.A0I;
                C18070vi.A0d(list5, 3);
                if (z8) {
                    textEmojiLabel.setText(2131892935);
                } else if (list5.isEmpty()) {
                    C74283Zf.A00(textEmojiLabel, r24, 2131892934);
                } else {
                    C74283Zf.A00(textEmojiLabel, r24, 2131891686);
                    view.setVisibility(8);
                    return;
                }
                view.setVisibility(0);
                return;
            case 7:
                AnonymousClass1E7 r8 = (AnonymousClass1E7) this.A01;
                C139626zB r3 = (C139626zB) this.A02;
                Object obj6 = this.A03;
                Collection collection = (Collection) this.A04;
                boolean z9 = this.A05;
                AnonymousClass3Ma.A1O(r8, 0, collection);
                r8.A01 = 0;
                AnonymousClass1M9 r9 = r3.A02;
                r9.A04.A0S(r8);
                if (C18020vd.A05(C18040vf.A02, r9.A0H, 10624)) {
                    r9.A02.A00(r8);
                }
                r9.A0I.A00(new C70623Bv(r9, r8, 18));
                C26811To r15 = r3.A01;
                if (obj6 == null) {
                    A0M = C18460wS.A00;
                } else {
                    A0M = C18070vi.A0M(obj6);
                }
                r15.A0O(collection, A0M, false);
                if (!z9) {
                    r3.A00.A0J(new C146437Pc(r3, 47));
                    return;
                }
                return;
            case 8:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                C29681ch r112 = (C29681ch) this.A02;
                Context context2 = (Context) this.A03;
                Object obj7 = this.A04;
                boolean z10 = this.A05;
                AnonymousClass6GM r25 = (AnonymousClass6GM) contactPickerFragment.A2h.get();
                ArrayList A13 = AnonymousClass000.A13();
                AnonymousClass73D r52 = new AnonymousClass73D();
                AnonymousClass1E7 A014 = contactPickerFragment.A1G.A01(r112);
                String A0I = contactPickerFragment.A0k.A0I(A014);
                if (A0I == null) {
                    A0I = "";
                }
                AnonymousClass72S A042 = r25.A04(context2, A014, new C20947Ac1(r112, AnonymousClass9Id.LINK_CARD, A0I, A0I, 0));
                if (A042 != null) {
                    A13.add(A042.A0X);
                    r52.A06(A042);
                }
                contactPickerFragment.A0S.A0J(new AnonymousClass7QF(contactPickerFragment, A13, r52, obj7, context2, 3, z10));
                return;
            case 9:
                boolean z11 = this.A05;
                C187929gb r06 = (C187929gb) this.A04;
                ((WebPagePreviewView) this.A01).A0P((C143887Fe) this.A02, (List) this.A03, z11);
                C88644aH r16 = r06.A00;
                AnonymousClass206 r27 = r06.A01;
                boolean z12 = r06.A04;
                C88644aH.A03(r16.A0E, r16, r27, r06.A02, r06.A03, z12, r06.A05, r06.A06);
                return;
            case 10:
                C1407773a r62 = (C1407773a) this.A01;
                C441322g r53 = (C441322g) this.A02;
                boolean z13 = this.A05;
                C1418377d r32 = (C1418377d) this.A03;
                AnonymousClass4LJ r28 = (AnonymousClass4LJ) this.A04;
                if (r53.A0v.equals(r62.A05.getTag())) {
                    C1407773a.A01(r62, r53, r32, z13);
                    if (r28 != null) {
                        AnonymousClass3tQ r17 = r28.A00;
                        if (!r17.A0U.A0N() && ((C441322g) ((AnonymousClass21V) r17.A0I)).A05 != null) {
                            r17.A1z();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                AnonymousClass122 r54 = (AnonymousClass122) this.A01;
                Collection collection2 = (Collection) this.A02;
                boolean z14 = this.A05;
                HashMap hashMap = (HashMap) this.A03;
                Set set = (Set) this.A04;
                C24681Lg r07 = r54.A0S;
                if (!z14) {
                    hashMap = null;
                }
                r07.A05(collection2, hashMap);
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((AnonymousClass1Q1) r54.A19.get()).A03(C17880vN.A0Q(it2), false);
                }
                return;
            case 14:
                AnonymousClass1EC r33 = (AnonymousClass1EC) this.A03;
                boolean z15 = this.A05;
                AnonymousClass126.A09((AnonymousClass126) this.A01, (DeviceJid) this.A04, r33, (C62502rV) this.A02, z15);
                return;
            case 15:
                C32431hB r55 = (C32431hB) this.A01;
                C136996uk r42 = (C136996uk) this.A02;
                AnonymousClass21V r34 = (AnonymousClass21V) this.A03;
                boolean z16 = this.A05;
                if (!C32431hB.A07(r55)) {
                    synchronized (r34) {
                        C32431hB.A01(r42, r55, r34, false);
                    }
                }
                C62572rc r18 = r34.A02;
                if (r18 != null) {
                    ((AnonymousClass168) r55.A0J.get()).A01(r18);
                    C17960vV.A07(r42.A01());
                    C32431hB.A04(r55, r34, r42.A01().A01, z16);
                    return;
                }
                return;
            case 16:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A01;
                List list7 = (List) this.A03;
                boolean z17 = this.A05;
                C46162Dk r72 = (C46162Dk) this.A04;
                int A1X = AnonymousClass8BU.A1X(list7);
                if (newsletterInfoActivity.A02.A0O((AnonymousClass1BI) this.A02)) {
                    A0q = newsletterInfoActivity.getString(2131889503);
                } else {
                    Object[] objArr = new Object[A1X];
                    AnonymousClass00H r08 = newsletterInfoActivity.A14;
                    if (r08 != null) {
                        A0q = C17880vN.A0q(newsletterInfoActivity, ((AnonymousClass4XL) r08.get()).A01(list7), objArr, 0, 2131889495);
                    } else {
                        str = "newsletterMultiAdminUtils";
                        C18070vi.A11(str);
                        throw null;
                    }
                }
                C18070vi.A0b(A0q);
                if (z17) {
                    AnonymousClass00H r09 = newsletterInfoActivity.A15;
                    if (r09 != null) {
                        Integer A052 = ((A6Q) r09.get()).A05((Integer) null, 5);
                        AnonymousClass440 r19 = newsletterInfoActivity.A0m;
                        if (r19 == null) {
                            C18070vi.A11("newsletterViewModel");
                            throw null;
                        }
                        r19.A0T(r72.A0M(), A052);
                    } else {
                        str = "newsletterPerfTracker";
                        C18070vi.A11(str);
                        throw null;
                    }
                }
                NewsletterInfoActivity.A1J(newsletterInfoActivity, A0q, false);
                return;
            case 17:
                AnonymousClass72F r56 = (AnonymousClass72F) this.A01;
                C1601387g r43 = (C1601387g) this.A02;
                AEX aex = (AEX) this.A03;
                File file = (File) this.A04;
                boolean z18 = this.A05;
                if (r43 != null) {
                    r43.Blb(aex, file);
                }
                if (!z18) {
                    AnonymousClass10T A0V = C17880vN.A0V(r56.A0D);
                    if (file != null) {
                        aWq = new C96994ok(24);
                    } else {
                        aWq = new C20735AWq(40);
                    }
                    A0V.notifyAllObservers(aWq);
                    return;
                }
                return;
            case 18:
                C112295lF r57 = (C112295lF) this.A01;
                boolean z19 = this.A05;
                AnonymousClass4VT r35 = (AnonymousClass4VT) this.A02;
                C113495nB r29 = (C113495nB) this.A03;
                AnonymousClass725 r010 = (AnonymousClass725) this.A04;
                if (z19) {
                    C112295lF.A01(r57, r29, r35);
                }
                C112295lF.A00(r010, r57, r29);
                return;
            default:
                C61772qE r63 = (C61772qE) this.A01;
                AnonymousClass1BI r58 = (AnonymousClass1BI) this.A03;
                C199310e r44 = (C199310e) this.A04;
                boolean z20 = this.A05;
                for (AnonymousClass1E9 r36 : (Set) this.A02) {
                    AnonymousClass1IZ it3 = r44.iterator();
                    while (true) {
                        boolean z21 = false;
                        while (true) {
                            if (it3.hasNext()) {
                                if (r63.A04.A08.A05(new C59982nC(C63962tz.A02((DeviceJid) it3.next()), r36.getRawString()), false) || z21) {
                                    z21 = true;
                                }
                            } else if (z21 && !z20) {
                                AnonymousClass1PT r210 = r63.A08;
                                int i5 = 8;
                                if (r63.A00.A0O(r58)) {
                                    i5 = 7;
                                }
                                r210.A0D(r36, Integer.valueOf(i5));
                            }
                        }
                    }
                }
                return;
        }
    }

    public C21437Ak4(C27221Da0 da0, C26809DEr dEr, List list, UUID uuid) {
        this.A00 = 1;
        this.A01 = dEr;
        this.A02 = list;
        this.A03 = da0;
        this.A05 = true;
        this.A04 = uuid;
    }
}
