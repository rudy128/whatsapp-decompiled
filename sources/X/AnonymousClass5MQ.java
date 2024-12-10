package X;

import com.whatsapp.calling.favorite.FavoritePickerViewModel;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5MQ  reason: invalid class name */
public final class AnonymousClass5MQ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C107185Ys $favoriteSuggestionsManagerFactory;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5MQ(C107185Ys r2, FavoritePickerViewModel favoritePickerViewModel) {
        super(0);
        this.$favoriteSuggestionsManagerFactory = r2;
        this.this$0 = favoritePickerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C107185Ys r3 = this.$favoriteSuggestionsManagerFactory;
        AnonymousClass1OX A00 = C41561wd.A00(this.this$0);
        Integer num = AnonymousClass00R.A01;
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        long millis = currentTimeMillis - timeUnit.toMillis(60);
        long currentTimeMillis2 = System.currentTimeMillis() - timeUnit.toMillis(60);
        AnonymousClass9IL[] r4 = new AnonymousClass9IL[4];
        r4[0] = AnonymousClass9IL.STARRED_CONTACTS;
        r4[1] = AnonymousClass9IL.ONE_ON_ONE;
        r4[2] = AnonymousClass9IL.LGC;
        return r3.BH6(new C188419hO(num, C18070vi.A0O(AnonymousClass9IL.GROUP_CHAT, r4, 3), 3, 0, 992, millis, currentTimeMillis2, false), A00);
    }
}
