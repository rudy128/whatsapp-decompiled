package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5UG  reason: invalid class name */
public final class AnonymousClass5UG extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass3WF $adapter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UG(AnonymousClass3WF r2) {
        super(1);
        this.$adapter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1D6 r8 = (AnonymousClass1D6) obj;
        Object obj2 = r8.second;
        List<File> list = ((C85274Mt) r8.first).A01;
        AnonymousClass3WF r5 = this.$adapter;
        ArrayList A0D = C29351c6.A0D(list);
        for (File file : list) {
            A0D.add(new C80393x4(file, C18070vi.A18(file.getPath(), obj2)));
        }
        r5.A0W(C29431cG.A0k(A0D, r5.A05));
        return C27621Wu.A00;
    }
}
