package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.view.View;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.calling.views.JoinableEducationDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts;
import java.util.List;

/* renamed from: X.3cF  reason: invalid class name and case insensitive filesystem */
public class C74713cF extends C39381sz {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74713cF(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        super(changeNumberNotifyContacts);
        this.A00 = 3;
        this.A01 = changeNumberNotifyContacts;
    }

    public void onClick(View view) {
        switch (this.A00) {
            case 0:
                C34001jj A0H = AnonymousClass3Ma.A0H((AnonymousClass1FL) this.A01);
                A0H.A0B(JoinableEducationDialogFragment.A00(), (String) null);
                A0H.A02();
                return;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                contactPickerFragment.A0J.A08(contactPickerFragment.A1n(), AnonymousClass3MY.A07(contactPickerFragment.A1p.A04("26000253")));
                return;
            case 2:
                AnonymousClass4aY r2 = (AnonymousClass4aY) this.A01;
                r2.A4B.A01(3);
                AnonymousClass4aY.A1l(r2, true);
                return;
            case 3:
                ChangeNumberNotifyContacts changeNumberNotifyContacts = (ChangeNumberNotifyContacts) this.A01;
                Intent intent = new Intent(changeNumberNotifyContacts, NotifyContactsSelector.class);
                List list = changeNumberNotifyContacts.A0A;
                if (list != null) {
                    intent.putStringArrayListExtra("selected", C22971Dz.A0B(list));
                    changeNumberNotifyContacts.startActivityForResult(intent, 1);
                    return;
                }
                throw C17880vN.A0g();
            default:
                ((Runnable) this.A01).run();
                return;
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (6 - this.A00 != 0) {
            super.updateDrawState(textPaint);
            return;
        }
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74713cF(Context context, GroupCallParticipantPicker groupCallParticipantPicker, int i) {
        super(context, i);
        this.A00 = 0;
        this.A01 = groupCallParticipantPicker;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74713cF(Context context, Runnable runnable, int i, int i2) {
        super(context, i);
        this.A00 = i2;
        this.A01 = runnable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74713cF(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }
}
