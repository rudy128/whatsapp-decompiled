package X;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.7s5  reason: invalid class name and case insensitive filesystem */
public final class C155027s5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass79F this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155027s5(AnonymousClass79F r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        JSONArray optJSONArray = C17880vN.A0P(this.this$0.A00).A0J(9863).optJSONArray("allowed_hosts");
        if (optJSONArray == null) {
            return C18460wS.A00;
        }
        int length = optJSONArray.length();
        ArrayList A0z = C17880vN.A0z(length);
        int i = 0;
        while (i < length) {
            Object obj = optJSONArray.get(i);
            if (obj != null) {
                A0z.add(obj);
                i++;
            } else {
                throw AnonymousClass000.A0s("null cannot be cast to non-null type kotlin.String");
            }
        }
        ArrayList A0D = C29351c6.A0D(A0z);
        Iterator it = A0z.iterator();
        while (it.hasNext()) {
            A0D.add(C108975cc.A0d(C17880vN.A0v(it)));
        }
        return A0D;
    }
}
