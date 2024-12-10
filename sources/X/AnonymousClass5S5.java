package X;

import android.database.Cursor;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5S5  reason: invalid class name */
public final class AnonymousClass5S5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5S5(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1D6 r8 = (AnonymousClass1D6) obj;
        Cursor cursor = (Cursor) r8.first;
        List<AnonymousClass9DH> list = (List) r8.second;
        AnonymousClass3X5 r6 = this.this$0.A05;
        if (r6 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        C18070vi.A0d(list, 1);
        r6.A00 = cursor;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C72483Me.A07(list));
        for (AnonymousClass9DH r0 : list) {
            String str = r0.A02;
            List<AnonymousClass9DF> list2 = (List) r0.A01;
            ArrayList A0E = C29351c6.A0E(list2);
            for (AnonymousClass9DF r02 : list2) {
                A0E.add(r02.A01);
            }
            linkedHashMap.put(str, C17880vN.A10(A0E));
        }
        r6.A01 = linkedHashMap;
        r6.notifyDataSetChanged();
        ReportToAdminMessagesActivity reportToAdminMessagesActivity = this.this$0;
        C28931bI A0v = AnonymousClass3MX.A0v(reportToAdminMessagesActivity.A0B);
        AnonymousClass3X5 r03 = reportToAdminMessagesActivity.A05;
        if (r03 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        int A0Q = r03.A0Q();
        int i = 8;
        if (A0Q == 0) {
            i = 0;
        }
        A0v.A04(i);
        AnonymousClass3MX.A0v(this.this$0.A0C).A04(8);
        return C27621Wu.A00;
    }
}
