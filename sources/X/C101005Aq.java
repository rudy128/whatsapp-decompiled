package X;

import android.content.Context;
import com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel;

/* renamed from: X.5Aq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101005Aq extends AnonymousClass1JJ implements AnonymousClass20H {
    public C101005Aq(Object obj) {
        super(5, obj, CallLogActivityViewModel.class, "onCallClick", "onCallClick(Landroid/content/Context;ZZLcom/whatsapp/data/WAContact;Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Context context = (Context) obj;
        boolean A1Y = AnonymousClass000.A1Y(obj2);
        boolean A1Y2 = AnonymousClass000.A1Y(obj3);
        boolean A1Y3 = AnonymousClass000.A1Y(obj5);
        AnonymousClass3Ma.A1O(context, 0, obj4);
        ((CallLogActivityViewModel) this.receiver).A0T(context, (C89444cT) null, C18070vi.A0M(obj4), A1Y, A1Y2, A1Y3);
        return C27621Wu.A00;
    }
}
