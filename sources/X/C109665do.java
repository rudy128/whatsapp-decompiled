package X;

import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: X.5do  reason: invalid class name and case insensitive filesystem */
public final class C109665do extends SpannableStringBuilder {
    public final Class A00;
    public final List A01 = AnonymousClass000.A13();

    private C1419077k A00(Object obj) {
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i >= list.size()) {
                return null;
            }
            C1419077k r1 = (C1419077k) list.get(i);
            if (r1.A00 == obj) {
                return r1;
            }
            i++;
        }
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        List list;
        int i3 = 0;
        while (true) {
            list = this.A01;
            if (i3 >= list.size()) {
                break;
            }
            ((C1419077k) list.get(i3)).A01.incrementAndGet();
            i3++;
        }
        super.replace(i, i2, charSequence);
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((C1419077k) list.get(i4)).A01.decrementAndGet();
        }
        return this;
    }

    public int getSpanEnd(Object obj) {
        C1419077k A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C1419077k A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C1419077k A002;
        if (!(obj == null || this.A00 != obj.getClass() || (A002 = A00(obj)) == null)) {
            obj = A002;
        }
        return super.getSpanStart(obj);
    }

    public Object[] getSpans(int i, int i2, Class cls) {
        if (this.A00 != cls) {
            return super.getSpans(i, i2, cls);
        }
        C1419077k[] r4 = (C1419077k[]) super.getSpans(i, i2, C1419077k.class);
        int length = r4.length;
        Object[] objArr = (Object[]) Array.newInstance(cls, length);
        for (int i3 = 0; i3 < length; i3++) {
            objArr[i3] = r4[i3].A00;
        }
        return objArr;
    }

    public int nextSpanTransition(int i, int i2, Class<C1419077k> cls) {
        if (cls == null || this.A00 == cls) {
            cls = C1419077k.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C1419077k r1;
        if (obj == null || this.A00 != obj.getClass()) {
            r1 = null;
        } else {
            r1 = A00(obj);
            if (r1 != null) {
                obj = r1;
            }
        }
        super.removeSpan(obj);
        if (r1 != null) {
            this.A01.remove(r1);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj != null && this.A00 == obj.getClass()) {
            C1419077k r1 = new C1419077k(obj);
            this.A01.add(r1);
            obj = r1;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return new C109665do(this, this.A00, i, i2);
    }

    public C109665do(CharSequence charSequence, Class cls) {
        super(charSequence);
        this.A00 = cls;
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    public C109665do(CharSequence charSequence, Class cls, int i, int i2) {
        super(charSequence, i, i2);
        C28111Yx.A03(cls, "watcherClass cannot be null");
        this.A00 = cls;
    }

    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        List list;
        int i5 = 0;
        while (true) {
            list = this.A01;
            if (i5 >= list.size()) {
                break;
            }
            ((C1419077k) list.get(i5)).A01.incrementAndGet();
            i5++;
        }
        super.replace(i, i2, charSequence, i3, i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((C1419077k) list.get(i6)).A01.decrementAndGet();
        }
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }
}
