package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6MJ  reason: invalid class name */
public class AnonymousClass6MJ extends A34 {
    public final AnonymousClass1LA A00;
    public final C26911Ty A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass11C A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;
    public final AnonymousClass1BI A06;
    public final WeakReference A07;
    public final List A08;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A07);
        if (A0Z != null) {
            Intent intent = A0Z.getIntent();
            AnonymousClass1BI r5 = this.A06;
            A0Z.CNh(AnonymousClass1LU.A0R(A0Z, AnonymousClass25A.A04(AnonymousClass25A.A09(intent.getBundleExtra("quoted_message"))), r5, AnonymousClass1EC.A01.A02(intent.getStringExtra("quoted_group_jid")), arrayList, AnonymousClass3MY.A1a(intent, "has_number_from_url")), 8);
            A0Z.CEx();
        }
    }

    public void A0F() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A07);
        if (A0Z != null) {
            C108965cb.A17(A0Z);
        }
    }

    public AnonymousClass6MJ(AnonymousClass1LA r2, C26911Ty r3, AnonymousClass1M9 r4, PhoneContactsSelector phoneContactsSelector, AnonymousClass11C r6, AnonymousClass118 r7, C18000vb r8, AnonymousClass1BI r9, List list) {
        this.A04 = r7;
        this.A02 = r4;
        this.A03 = r6;
        this.A05 = r8;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = AnonymousClass3MW.A0z(phoneContactsSelector);
        this.A06 = r9;
        this.A08 = list;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList A13 = AnonymousClass000.A13();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("phonecontactsselector/onsubmit/convertcontactstask ");
        List<AnonymousClass25N> list = this.A08;
        A10.append(list.size());
        AnonymousClass1Ez r4 = new AnonymousClass1Ez(AnonymousClass000.A0y(" selected contacts", A10));
        for (AnonymousClass25N r10 : list) {
            String str = r10.A02;
            if (str == null) {
                long j = r10.A04;
                SystemClock.uptimeMillis();
                AnonymousClass118 r12 = this.A04;
                str = PhoneContactsSelector.A0z(this.A00, this.A01, this.A02, r10, this.A03, r12, this.A05);
                r10.A02 = str;
                SystemClock.uptimeMillis();
                if (str == null) {
                    Log.w(C17890vO.A0a("phonecontactsselector/onsubmit/convertcontactstask/could not generate vcard for contact with id ", AnonymousClass000.A10(), j));
                }
            }
            A13.add(str);
        }
        r4.A02();
        return A13;
    }
}
