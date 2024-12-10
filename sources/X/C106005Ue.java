package X;

import com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Ue  reason: invalid class name and case insensitive filesystem */
public final class C106005Ue extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C93564jB $row;
    public final /* synthetic */ C76253my this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106005Ue(C93564jB r2, C76253my r3) {
        super(1);
        this.this$0 = r3;
        this.$row = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object value;
        ArrayList<C62482rT> A13;
        long j;
        C76253my r1 = this.this$0;
        List list = C42011xT.A0I;
        C107195Yt r3 = r1.A00;
        C62482rT r4 = this.$row.A01;
        int A05 = r1.A05();
        FavoriteCallListActivity favoriteCallListActivity = (FavoriteCallListActivity) r3;
        AnonymousClass1BI r8 = r4.A03;
        AnonymousClass3XD r12 = favoriteCallListActivity.A03;
        if (r12 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        if (A05 >= 0 && A05 < r12.A00.size()) {
            r12.A00.remove(A05);
            r12.A0I(A05);
        }
        FavoriteCallListViewModel favoriteCallListViewModel = (FavoriteCallListViewModel) favoriteCallListActivity.A0F.getValue();
        AnonymousClass3MW.A1X(favoriteCallListViewModel.A0B, new FavoriteCallListViewModel$deleteFavorite$1(favoriteCallListViewModel, r4, (C30391dr) null), C41561wd.A00(favoriteCallListViewModel));
        AnonymousClass1G4 r6 = favoriteCallListViewModel.A0E;
        do {
            value = r6.getValue();
            A13 = AnonymousClass000.A13();
            for (Object next : (List) value) {
                if (!C18070vi.A18(((C62482rT) next).A03, r8)) {
                    A13.add(next);
                }
            }
            C41901xH r122 = (C41901xH) favoriteCallListViewModel.A08.get();
            LinkedHashMap A132 = C17880vN.A13();
            for (C62482rT r0 : A13) {
                C49512Qt r2 = r0.A02;
                Object obj2 = A132.get(r2);
                if (obj2 == null && !A132.containsKey(r2)) {
                    obj2 = new Object();
                }
                C98474rD r13 = (C98474rD) obj2;
                r13.element++;
                A132.put(r2, r13);
            }
            Iterator A15 = AnonymousClass000.A15(A132);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                C18070vi.A0z(A16, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
                C41681wt.A02(A16).setValue(Integer.valueOf(((C98474rD) A16.getValue()).element));
            }
            Map A03 = C41681wt.A03(A132);
            Number number = (Number) A03.get(C49512Qt.ONE_TO_ONE);
            long j2 = 0;
            if (number != null) {
                j = (long) number.intValue();
            } else {
                j = 0;
            }
            Number number2 = (Number) A03.get(C49512Qt.GROUP);
            if (number2 != null) {
                j2 = (long) number2.intValue();
            }
            C41901xH.A00(r122, 10, Long.valueOf(j2 + j), Long.valueOf(j), Long.valueOf(j2), (Long) null, (Long) null, (Long) null, (Long) null, (Long) null);
        } while (!r6.BFK(value, A13));
        favoriteCallListViewModel.A02.A01(10, 42, 15);
        return C27621Wu.A00;
    }
}
