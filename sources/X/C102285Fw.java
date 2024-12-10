package X;

import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Fw  reason: invalid class name and case insensitive filesystem */
public final class C102285Fw extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102285Fw(CallSuggestionsViewModel callSuggestionsViewModel) {
        super(0);
        this.this$0 = callSuggestionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9IL[] r1;
        AnonymousClass9IL r0;
        C18030ve r12 = this.this$0.A06;
        C18040vf r2 = C18040vf.A02;
        int A00 = C18020vd.A00(r2, r12, 11775);
        boolean z = false;
        if (C18020vd.A00(r2, this.this$0.A06, 4833) >= 6) {
            z = true;
        }
        boolean A05 = C18020vd.A05(r2, this.this$0.A06, 11886);
        CallSuggestionsViewModel callSuggestionsViewModel = this.this$0;
        C107185Ys r3 = callSuggestionsViewModel.A04;
        AnonymousClass1OX A002 = C41561wd.A00(callSuggestionsViewModel);
        Integer num = AnonymousClass00R.A0C;
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        long millis = currentTimeMillis - timeUnit.toMillis(60);
        long currentTimeMillis2 = System.currentTimeMillis() - timeUnit.toMillis(60);
        int i = 4;
        if (z) {
            r1 = new AnonymousClass9IL[7];
            r1[0] = AnonymousClass9IL.ADHOC_MEMBERS;
            r1[1] = AnonymousClass9IL.LGC_MEMBERS;
            r1[2] = AnonymousClass9IL.FAVORITE_GROUP_CHAT_MEMBERS;
            r1[3] = AnonymousClass9IL.GROUP_CHAT_MEMBERS;
            r1[4] = AnonymousClass9IL.STARRED_CONTACTS;
            r1[5] = AnonymousClass9IL.ONE_ON_ONE;
            i = 6;
            r0 = AnonymousClass9IL.FAVORITES;
        } else {
            r1 = new AnonymousClass9IL[5];
            r1[0] = AnonymousClass9IL.ADHOC_MEMBERS;
            r1[1] = AnonymousClass9IL.LGC_MEMBERS;
            r1[2] = AnonymousClass9IL.GROUP_CHAT_MEMBERS;
            r1[3] = AnonymousClass9IL.STARRED_CONTACTS;
            r0 = AnonymousClass9IL.ONE_ON_ONE;
        }
        List A0O = C18070vi.A0O(r0, r1, i);
        if (A00 < 5) {
            A00 = 5;
        } else if (A00 > 7) {
            A00 = 7;
        }
        return r3.BH6(new C188419hO(num, A0O, 20, A00, 608, millis, currentTimeMillis2, A05), A002);
    }
}
