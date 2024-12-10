package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.calling.calllink.CallLinkShareReceiver;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.74H  reason: invalid class name */
public abstract class AnonymousClass74H {
    public static String A05(Context context, AnonymousClass1M9 r8, C24921Me r9, AnonymousClass126 r10, GroupJid groupJid, C24901Mc r12, List list, boolean z) {
        String A0q;
        AnonymousClass1M9 r2 = r8;
        AnonymousClass1E7 A01 = C63982u1.A01(r8, r10, groupJid, r12, z);
        C24921Me r3 = r9;
        if (A01 != null && (A0q = AnonymousClass3MY.A0q(r9, A01)) != null) {
            return A0q;
        }
        return C63462t7.A02(A06(context, r2, r3, list, 2, AnonymousClass000.A1T(list.size(), 1)));
    }

    public static String A06(Context context, AnonymousClass1M9 r7, C24921Me r8, List list, int i, boolean z) {
        AnonymousClass4ZN A04 = A04(r7, r8, list, i, z, false);
        if (A04 == null) {
            return null;
        }
        return A04.A03(context).toString();
    }

    public static void A08(AnonymousClass1FL r7, AnonymousClass11S r8, AnonymousClass1M9 r9, C18030ve r10, C178119Bw r11, int i) {
        ArrayList arrayList;
        ArrayList A0B = r11.A0B();
        ArrayList A0g = C108975cc.A0g(A0B);
        Iterator it = A0B.iterator();
        while (it.hasNext()) {
            UserJid A00 = C22941Dw.A00(((C178109Bv) it.next()).A00);
            if (A00 != null && !r8.A0O(A00)) {
                A0g.add(A00);
            }
        }
        if (A0g.size() < C18020vd.A00(C18040vf.A02, r10, 862)) {
            arrayList = C17880vN.A10(A0g);
        } else {
            arrayList = null;
        }
        A09(r7, r9, (GroupJid) null, A0g, arrayList, i, false);
    }

    public static Intent A00(Context context, String str, String str2, int i, boolean z) {
        IntentSender intentSender;
        Intent A0G = C108945cZ.A0G("android.intent.action.SEND");
        A0G.putExtra("android.intent.extra.TEXT", str);
        A0G.putExtra("android.intent.extra.SUBJECT", str2);
        A0G.setType("text/plain");
        A0G.addFlags(524288);
        if (Build.VERSION.SDK_INT < 22) {
            intentSender = null;
        } else {
            Intent putExtra = new Intent(context, CallLinkShareReceiver.class).putExtra("extra_entry_point", i).putExtra("extra_is_video", z);
            int i2 = 134217728;
            C1408573i.A04(putExtra, 134217728);
            if (C1408573i.A02) {
                i2 = 167772160;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, putExtra, i2);
            synchronized (C1408573i.A01) {
                C1408573i.A00++;
            }
            intentSender = broadcast.getIntentSender();
        }
        return AnonymousClass4aU.A01(intentSender, (CharSequence) null, Collections.singletonList(A0G));
    }

    public static C1182662u A02(String str, int i, int i2, boolean z) {
        C1182662u r1 = new C1182662u();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        r1.A02 = Integer.valueOf(C72453Mb.A03(z ? 1 : 0));
        r1.A03 = str;
        return r1;
    }

    public static AnonymousClass63F A03(String str, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass63F r1 = new AnonymousClass63F();
        r1.A04 = str;
        r1.A03 = Integer.valueOf(i);
        r1.A02 = Boolean.valueOf(z);
        r1.A01 = Boolean.valueOf(z2);
        r1.A00 = Boolean.valueOf(z3);
        return r1;
    }

    public static String A07(String str, boolean z) {
        String str2;
        Uri.Builder authority = new Uri.Builder().scheme("https").authority("call.whatsapp.com");
        if (z) {
            str2 = "video";
        } else {
            str2 = "voice";
        }
        return C108985cd.A0D(authority, str2, str).toString();
    }

    public static boolean A0A(C219217x r1, AnonymousClass1DC r2, boolean z) {
        if (!z || !r2.BcY()) {
            return false;
        }
        if (AnonymousClass112.A01()) {
            if (r1.A02("android.permission.CAMERA") != 0) {
                return true;
            }
            return false;
        } else if (r1.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static Bitmap A01(Context context, AnonymousClass1VW r5, C27201Vd r6, AnonymousClass1E7 r7) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(17104902);
        Bitmap A03 = r6.A03(context, r7, dimensionPixelSize, dimensionPixelSize2);
        if (A03 != null) {
            return A03;
        }
        return r5.A07(r7, resources.getDimension(2131168737), Math.min(dimensionPixelSize, dimensionPixelSize2));
    }

    public static AnonymousClass4ZN A04(AnonymousClass1M9 r6, C24921Me r7, List list, int i, boolean z, boolean z2) {
        String A0q;
        ArrayList A13 = AnonymousClass000.A13();
        int i2 = 0;
        while (i2 < i && i2 < list.size()) {
            AnonymousClass1E7 A0H = r6.A0H(C108945cZ.A0i(list, i2));
            if (z) {
                A0q = r7.A0I(A0H);
            } else if (z2) {
                A0q = r7.A0J(A0H);
            } else {
                A0q = AnonymousClass3MY.A0q(r7, A0H);
            }
            A13.add(A0q);
            i2++;
        }
        if (list.size() > i) {
            int A02 = AnonymousClass3MX.A02(list, 1);
            Object[] objArr = new Object[2];
            objArr[0] = A13.get(0);
            C17880vN.A1T(objArr, AnonymousClass3MX.A02(list, 1), 1);
            return C1402670q.A01(objArr, 2131755311, A02);
        } else if (list.size() == 2) {
            Object[] objArr2 = new Object[2];
            C108985cd.A1Q(A13, objArr2);
            return C1402670q.A02(objArr2, 2131897208);
        } else if (list.size() == 3) {
            Object[] objArr3 = new Object[3];
            C108985cd.A1Q(A13, objArr3);
            objArr3[2] = A13.get(2);
            return C1402670q.A02(objArr3, 2131896872);
        } else if (list.size() == 1) {
            return C1402670q.A00(C108945cZ.A1H(A13, 0));
        } else {
            if (list.size() == 0) {
                return AnonymousClass3MX.A0t(2131887660);
            }
            C17960vV.A0F(false, "Number of names not supported");
            return null;
        }
    }

    public static void A09(AnonymousClass1FL r6, AnonymousClass1M9 r7, GroupJid groupJid, List list, List list2, int i, boolean z) {
        ArrayList A14 = AnonymousClass000.A14(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (r7.A0z(A0Q) || !z) {
                A14.add(A0Q);
            }
        }
        int size = list.size() - A14.size();
        Integer valueOf = Integer.valueOf(i);
        C17960vV.A0F(C17880vN.A1X(A14), "List must be non empty");
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(r6.getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet");
        A0A.putStringArrayListExtra("jids", C22971Dz.A0B(A14));
        if (list2 != null && !list2.isEmpty()) {
            A0A.putStringArrayListExtra("selected", C22971Dz.A0B(list2));
        }
        if (groupJid != null) {
            A0A.putExtra("source_group_jid", groupJid);
        }
        A0A.putExtra("hidden_jids", size);
        A0A.putExtra("call_from_ui", valueOf);
        r6.startActivity(A0A);
        r6.overridePendingTransition(0, 0);
    }

    public static boolean A0B(C18030ve r4, AnonymousClass1DC r5, CallInfo callInfo) {
        int connectedParticipantsCount = callInfo.getConnectedParticipantsCount();
        if (!callInfo.videoEnabled || !r5.Bfb()) {
            return false;
        }
        C18040vf r2 = C18040vf.A02;
        if (connectedParticipantsCount > C18020vd.A00(r2, r4, 3694)) {
            return false;
        }
        if (C18020vd.A00(r2, ((AnonymousClass1DD) r5).A02, 3171) >= 2 || connectedParticipantsCount <= 2) {
            return true;
        }
        return false;
    }
}
