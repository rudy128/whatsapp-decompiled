package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl;
import com.whatsapp.infra.graphql.generated.textstatus.UpdateTextStatusResponseImpl;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6uV  reason: invalid class name and case insensitive filesystem */
public final class C136846uV {
    public AnonymousClass11S A00;
    public C19830z4 A01;
    public C57732jY A02;
    public Boolean A03;
    public AnonymousClass00H A04;
    public final C24671Lf A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass1KB A07;

    public final void A01(long j, String str, long j2, String str2) {
        SharedPreferences.Editor A002 = C19830z4.A00(this.A01);
        A002.putString("my_current_evolved_about_text", str);
        A002.putString("my_current_evolved_about_emoji", str2);
        A002.putLong("my_current_evolved_about_duration", j);
        A002.putLong("my_current_evolved_about_set_timestamp", j2);
        if (TextUtils.isEmpty((CharSequence) null)) {
            A002.remove("my_current_evolved_about_hash");
        } else {
            A002.putString("my_current_evolved_about_hash", (String) null);
        }
        A002.apply();
        this.A07.A0J(C146747Ql.A00(this, 0));
    }

    public final void A02(long j, String str, boolean z, String str2) {
        long j2 = j;
        this.A03 = Boolean.valueOf(z);
        C162478Kx r2 = null;
        String str3 = str2;
        A01(j2, str, AnonymousClass11P.A01(this.A06), str3);
        if (z) {
            j2 = -2;
        }
        C189819ju r3 = GraphQlCallInput.A02;
        if (!(str == null || str.length() == 0)) {
            r2 = r3.A00();
            C162478Kx.A01(r2, str, "text");
        }
        if (str2 != null) {
            C162478Kx A002 = r3.A00();
            C162478Kx.A01(A002, str3, "content");
            if (r2 == null) {
                r2 = r3.A00();
            }
            r2.A06(A002, "emoji");
        }
        Integer valueOf = Integer.valueOf((int) j2);
        if (r2 == null) {
            r2 = r3.A00();
        }
        C162478Kx.A01(r2, valueOf, "ephemeral_duration_sec");
        A7K a7k = new A7K();
        C108975cc.A0z(r2, a7k, "text_status_input");
        C172758ty r5 = new C172758ty(new C22197AzD(C108975cc.A0J(new AIj(a7k, UpdateTextStatusResponseImpl.class, "UpdateTextStatus"), this.A04)));
        AnonymousClass7SB A003 = AnonymousClass7SB.A00(this, 11);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C1193567u r0 = new C1193567u();
        r5.A00 = r0;
        A003.invoke(r0);
        r5.A06(32000, timeUnit);
    }

    public final C135726sf A00() {
        AnonymousClass00H r3 = this.A01.A00;
        long A052 = C17890vO.A05(C17880vN.A0B(r3), "my_current_evolved_about_duration");
        String A0r = C17880vN.A0r(C17880vN.A0B(r3), "my_current_evolved_about_text");
        if (A052 == 0 || (A052 == -1 && (A0r == null || AnonymousClass1YF.A0T(A0r)))) {
            return null;
        }
        if (A052 != -1 && AnonymousClass11P.A01(this.A06) > C17890vO.A05(C17880vN.A0B(r3), "my_current_evolved_about_set_timestamp") + TimeUnit.SECONDS.toMillis(A052)) {
            return null;
        }
        return new C135726sf(C17880vN.A0B(r3).getLong("my_current_evolved_about_duration", 0), A0r, C17880vN.A0B(r3).getLong("my_current_evolved_about_set_timestamp", 0), C17880vN.A0B(r3).getString("my_current_evolved_about_emoji", (String) null));
    }

    public final void A03(C57732jY r7) {
        AnonymousClass1BI r0;
        String rawString;
        this.A02 = r7;
        AnonymousClass11S r02 = this.A00;
        r02.A0I();
        AnonymousClass1E8 r03 = r02.A0D;
        if (r03 == null || (r0 = r03.A0J) == null || (rawString = r0.getRawString()) == null) {
            Log.e("Unable to fetch my jid");
            return;
        }
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A05("jid", rawString);
        graphQlCallInput.A05("last_update_time", (String) null);
        AnonymousClass1IX of = AnonymousClass1IX.of(graphQlCallInput);
        A7K a7k = new A7K();
        C72453Mb.A1R(of);
        a7k.A00.A06("input", of);
        C172758ty r5 = new C172758ty(new C22197AzD(C108975cc.A0J(new AIj(a7k, GetTextStatusListResponseImpl.class, "GetTextStatusList"), this.A04)));
        AnonymousClass7SB A002 = AnonymousClass7SB.A00(this, 10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C1193567u r04 = new C1193567u();
        r5.A00 = r04;
        A002.invoke(r04);
        r5.A06(32000, timeUnit);
    }

    public C136846uV(AnonymousClass1KB r2, AnonymousClass11S r3, C24671Lf r4, AnonymousClass11P r5, C19830z4 r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r2, r3, r7, r4);
        C18070vi.A0d(r6, 6);
        this.A06 = r5;
        this.A07 = r2;
        this.A00 = r3;
        this.A04 = r7;
        this.A05 = r4;
        this.A01 = r6;
    }
}
