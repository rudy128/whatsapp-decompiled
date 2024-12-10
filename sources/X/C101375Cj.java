package X;

import com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Cj  reason: invalid class name and case insensitive filesystem */
public final class C101375Cj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GroupCallParticipantSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101375Cj(GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel) {
        super(0);
        this.this$0 = groupCallParticipantSuggestionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel = this.this$0;
        C107185Ys r3 = groupCallParticipantSuggestionsViewModel.A04;
        AnonymousClass1OX A00 = C41561wd.A00(groupCallParticipantSuggestionsViewModel);
        Integer num = AnonymousClass00R.A01;
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        long millis = currentTimeMillis - timeUnit.toMillis(60);
        long currentTimeMillis2 = System.currentTimeMillis() - timeUnit.toMillis(60);
        AnonymousClass9IL[] r4 = new AnonymousClass9IL[4];
        r4[0] = AnonymousClass9IL.ONE_ON_ONE;
        r4[1] = AnonymousClass9IL.ADHOC_MEMBERS;
        r4[2] = AnonymousClass9IL.LGC_MEMBERS;
        return r3.BH6(new C188419hO(num, C18070vi.A0O(AnonymousClass9IL.GROUP_CHAT_MEMBERS, r4, 3), 3, 0, 992, millis, currentTimeMillis2, false), A00);
    }
}
