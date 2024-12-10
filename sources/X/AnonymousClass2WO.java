package X;

import java.util.Arrays;

/* renamed from: X.2WO  reason: invalid class name */
public abstract class AnonymousClass2WO {
    public static final String A00;
    public static final int[] A01;

    static {
        int[] iArr = {1, 3, 13, 9, 25, 26, 28, 29, 42, 43};
        A01 = iArr;
        String arrays = Arrays.toString(iArr);
        String substring = arrays.substring(1, arrays.length() - 1);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(" SELECT message_thumbnail.message_row_id FROM message_thumbnail INNER JOIN available_message_view WHERE message_thumbnail.message_row_id = available_message_view._id AND available_message_view.message_type IN (");
        A10.append(substring);
        A00 = AnonymousClass000.A0y(")", A10);
    }
}
