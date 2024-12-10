package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class A6L {
    public Set A00;
    public final C19880zA A01;
    public final C19880zA A02;
    public final C19880zA A03;
    public final A47 A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H = C221618v.A00(AnonymousClass16R.class);
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;
    public final AnonymousClass00H A0f;
    public final AnonymousClass00H A0g;
    public final AnonymousClass00H A0h;
    public final AnonymousClass00H A0i;
    public final AnonymousClass00H A0j;
    public final AnonymousClass00H A0k;
    public final AnonymousClass00H A0l;
    public final AnonymousClass00H A0m;

    public void A04(Activity activity, AnonymousClass86X r5, String str, String str2) {
        List A042 = ((AnonymousClass1FL) activity).getSupportFragmentManager().A0U.A04();
        C23520Bik A022 = C23520Bik.A02(((Fragment) A042.get(AnonymousClass3MX.A01(A042))).A0B, str, 0);
        A022.A0G(str2, new AnonymousClass78M(r5, activity, 29));
        A022.A08();
    }

    public void A03(Activity activity, B7Y b7y, String[] strArr) {
        if (this.A00 == null) {
            HashSet A12 = C17880vN.A12();
            this.A00 = A12;
            LinkedHashSet A14 = C17880vN.A14();
            C29401cD.A0L(A14, AnonymousClass73I.A00());
            C29401cD.A0L(A14, AnonymousClass73I.A03());
            A12.addAll(Arrays.asList(A14.toArray(new String[0])));
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str = strArr[i];
                if (!this.A00.contains(str)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Unauthorized permission request ");
                    A10.append(str);
                    A10.append(", Bloks allowed to request only whitelisted permissions ");
                    A10.append(this.A00);
                    C17890vO.A0w(A10);
                    break;
                }
                i++;
            } else if (activity instanceof AnonymousClass1FY) {
                AnonymousClass1FY r4 = (AnonymousClass1FY) activity;
                Intent A042 = AnonymousClass74O.A04(activity, (C219217x) this.A0m.get(), 30);
                if (A042 == null) {
                    b7y.C3p(true);
                    return;
                }
                r4.A4P(new AM1(r4, b7y, this, 0));
                r4.startActivityForResult(A042, 30);
                return;
            }
        }
        b7y.C3p(false);
    }

    public static UserJid A00(A6L a6l, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return AnonymousClass8BR.A0X(str);
            } catch (AnonymousClass11T e) {
                C22951Dx r0 = PhoneUserJid.Companion;
                PhoneUserJid A012 = C22951Dx.A01(str);
                ((AnonymousClass190) a6l.A0O.get()).A0G("bloks/openchat - Jid missing suffix", e.getMessage(), true);
                return A012;
            }
        } else {
            throw new AnonymousClass11T("Jid is Empty");
        }
    }

    public static String A01(HashMap hashMap) {
        ArrayList A10 = C17880vN.A10(hashMap.keySet());
        try {
            JSONObject A15 = C17880vN.A15();
            Collections.sort(A10);
            for (int i = 0; i < A10.size(); i++) {
                A15.put(C108945cZ.A1H(A10, i), hashMap.get(A10.get(i)));
            }
            return A15.toString();
        } catch (JSONException e) {
            Log.e("Failed to Convert Map to JSON object.", e);
            return null;
        }
    }

    public static void A02(Activity activity, String str) {
        Intent A0A2 = C17880vN.A0A();
        A0A2.setAction("android.intent.action.SEND");
        A0A2.putExtra("android.intent.extra.TEXT", str);
        A0A2.setType("text/plain");
        activity.startActivity(Intent.createChooser(A0A2, (CharSequence) null));
    }

    public A6L(C19880zA r3, C19880zA r4, C19880zA r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46, AnonymousClass00H r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50) {
        this.A04 = new A47(r7, r35);
        this.A0c = r6;
        this.A05 = r8;
        this.A0C = r9;
        this.A0R = r10;
        this.A0O = r11;
        this.A0T = r12;
        this.A0i = r13;
        this.A0j = r14;
        this.A06 = r15;
        this.A0k = r16;
        this.A0D = r17;
        this.A0a = r18;
        this.A0e = r19;
        this.A0X = r20;
        this.A0J = r21;
        this.A0L = r22;
        this.A0b = r23;
        this.A0W = r24;
        this.A07 = r25;
        this.A0M = r26;
        this.A0P = r27;
        this.A0N = r28;
        this.A0f = r29;
        this.A0l = r30;
        this.A0Y = r31;
        this.A0V = r32;
        this.A0G = r33;
        this.A0d = r34;
        this.A0I = r36;
        this.A0K = r37;
        this.A0A = r45;
        this.A0E = r38;
        this.A0B = r39;
        this.A08 = r41;
        this.A0m = r42;
        this.A0F = r40;
        this.A0Q = r43;
        this.A0h = r44;
        this.A09 = r46;
        this.A0U = r47;
        this.A0S = r48;
        this.A01 = r3;
        this.A0Z = r49;
        this.A0g = r50;
        this.A02 = r4;
        this.A03 = r5;
    }
}
