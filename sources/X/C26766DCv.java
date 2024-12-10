package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.DCv  reason: case insensitive filesystem */
public abstract class C26766DCv implements C28672EDo {
    public static final Set A02;
    public ECu A00;
    public Map A01 = C17880vN.A11();

    public Object BRU(String str) {
        Object obj = this.A01.get(str);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    static {
        String[] strArr = new String[11];
        strArr[0] = "encoded_size";
        strArr[1] = "encoded_width";
        strArr[2] = "encoded_height";
        strArr[3] = "uri_source";
        strArr[4] = "image_format";
        strArr[5] = "bitmap_config";
        strArr[6] = "is_rounded";
        strArr[7] = "non_fatal_decode_error";
        strArr[8] = "original_url";
        strArr[9] = "modified_url";
        A02 = C17900vP.A0I("image_color_space", strArr, 10);
    }

    public Map BRV() {
        return this.A01;
    }

    public void CD2(String str, Object obj) {
        if (A02.contains(str)) {
            this.A01.put(str, obj);
        }
    }

    public void CD3(Map map) {
        for (Object next : A02) {
            Object obj = map.get(next);
            if (obj != null) {
                this.A01.put(next, obj);
            }
        }
    }
}
