package X;

public abstract class CBB {
    public static String A00(String str, Object... objArr) {
        int length;
        String A0d;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                A0d = "null";
            } else {
                try {
                    A0d = obj.toString();
                } catch (Exception e) {
                    A0d = BEB.A0d(obj, e);
                }
            }
            objArr[i2] = A0d;
            i2++;
        }
        int length2 = str.length();
        StringBuilder A0q = BE7.A0q(length2, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0q.append(str, i3, indexOf);
            A0q.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0q.append(str, i3, length2);
        if (i < length) {
            int A0H = BE9.A0H(" [", A0q, objArr, i);
            while (A0H < length) {
                A0H = BE9.A0H(", ", A0q, objArr, A0H);
            }
            A0q.append(']');
        }
        return A0q.toString();
    }
}
