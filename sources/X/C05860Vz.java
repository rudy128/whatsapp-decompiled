package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.0Vz  reason: invalid class name and case insensitive filesystem */
public final class C05860Vz implements C16310s3 {
    public final /* synthetic */ AnonymousClass0W0 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C18090vk A02;

    public C05860Vz(AnonymousClass0W0 r1, String str, C18090vk r3) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r3;
    }

    public void CQA() {
        Map map = this.A00.A00;
        String str = this.A01;
        List list = (List) map.remove(str);
        if (list != null) {
            list.remove(this.A02);
            if (AnonymousClass000.A1a(list)) {
                map.put(str, list);
            }
        }
    }
}
