package X;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AFt  reason: case insensitive filesystem */
public class C20311AFt implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20311AFt(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        int i2 = i;
        switch (this.A00) {
            case 0:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) this.A02;
                AnonymousClass8DE A002 = materialCalendarGridView.A00();
                if (i2 >= A002.A02() && i2 <= (A002.A02() + A002.A04.A01) - 1) {
                    C22354B4h b4h = ((C161768Hr) this.A01).A03;
                    Long A03 = materialCalendarGridView.A00().getItem(i2);
                    long longValue = A03.longValue();
                    MaterialCalendar materialCalendar = ((AJO) b4h).A00;
                    if (materialCalendar.A06.A04.Bgw(longValue)) {
                        ((AJN) materialCalendar.A08).A01 = A03;
                        Iterator it = materialCalendar.A00.iterator();
                        while (it.hasNext()) {
                            ((C180749Nt) it.next()).A01(((AJN) materialCalendar.A08).A01);
                        }
                        materialCalendar.A04.A0B.notifyDataSetChanged();
                        RecyclerView recyclerView = materialCalendar.A05;
                        if (recyclerView != null) {
                            recyclerView.A0B.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AccountSwitchingBottomSheet accountSwitchingBottomSheet = (AccountSwitchingBottomSheet) this.A02;
                Log.i("AccountSwitchingBottomSheet/setupAccountList/switch account tapped");
                C194189rK r4 = (C194189rK) ((List) this.A01).get(i2);
                if (r4.A02) {
                    Log.i("AccountSwitchingBottomSheet/setupAccountList/isActiveAccount == true");
                    accountSwitchingBottomSheet.A29();
                    return;
                }
                AnonymousClass00H r0 = accountSwitchingBottomSheet.A0D;
                if (r0 != null) {
                    ((AnonymousClass739) C18070vi.A0E(r0)).A04((Boolean) null, accountSwitchingBottomSheet.A00, 6);
                    C62562rb r1 = r4.A01;
                    String str2 = r1.A07;
                    if (str2.length() == 0 && ((str = r1.A05) == null || str.length() == 0)) {
                        throw AnonymousClass000.A0k("Failed requirement.");
                    }
                    AnonymousClass00H r02 = accountSwitchingBottomSheet.A0C;
                    if (r02 != null) {
                        ((C29491cN) C18070vi.A0E(r02)).A0I(AnonymousClass3MY.A04(view), str2, r1.A05, (String) null, (String) null, (C18090vk) null, accountSwitchingBottomSheet.A00, false, false, false);
                        return;
                    }
                    C18070vi.A11("accountSwitcher");
                    throw null;
                }
                C18070vi.A11("accountSwitchingLogger");
                throw null;
            default:
                PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = (PaymentGroupParticipantPickerActivity) this.A01;
                Intent intent = (Intent) this.A02;
                C184879bf r03 = ((C187409fl) view.getTag()).A03;
                if (r03 != null) {
                    AnonymousClass1E7 r3 = r03.A00;
                    UserJid A0x = AnonymousClass3MZ.A0x(r3);
                    int A003 = AnonymousClass1R2.A00(paymentGroupParticipantPickerActivity.A08, A0x, paymentGroupParticipantPickerActivity.A0B);
                    if (!AnonymousClass3MW.A0V(paymentGroupParticipantPickerActivity.A0G).A0P(A0x) && A003 == 2) {
                        C17960vV.A07(A0x);
                        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity2 = paymentGroupParticipantPickerActivity;
                        A1K a1k = new A1K(paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity2, paymentGroupParticipantPickerActivity.A05, paymentGroupParticipantPickerActivity.A08, paymentGroupParticipantPickerActivity.A0C, paymentGroupParticipantPickerActivity.A0F, new C21435Ak2(paymentGroupParticipantPickerActivity, A0x, intent, 40), new C21435Ak2(paymentGroupParticipantPickerActivity, A0x, r3, 41), false, true);
                        if (a1k.A02()) {
                            a1k.A01(A0x, (C22376B5f) null, paymentGroupParticipantPickerActivity.A0H);
                            return;
                        } else {
                            PaymentGroupParticipantPickerActivity.A03(intent, A0x, paymentGroupParticipantPickerActivity);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
