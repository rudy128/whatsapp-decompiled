package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BrE  reason: case insensitive filesystem */
public class C23857BrE extends C25275CcQ {
    public boolean A00 = false;
    public final C25231CbS A01;
    public final String A02;

    public C23857BrE(AnonymousClass11N r9, C19830z4 r10, AnonymousClass182 r11, CT0 ct0, AnonymousClass185 r13, RandomAccessFile randomAccessFile, String str, int i, int i2) {
        super(r9, ct0, r13, randomAccessFile, i, i2);
        this.A01 = new C25231CbS(r10, r11, r13);
        this.A02 = str;
    }

    public void A04(List list) {
        int i;
        C25231CbS cbS = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int A0H = C72453Mb.A0H(it);
            if (A0H < 1000) {
                int i2 = A0H / 8;
                int i3 = A0H % 8;
                Iterator A15 = AnonymousClass000.A15(cbS.A05);
                while (true) {
                    if (!A15.hasNext()) {
                        break;
                    }
                    C25989Cq4 cq4 = (C25989Cq4) C17890vO.A0P(A15);
                    if (i2 == cq4.A04) {
                        List list2 = cq4.A07;
                        ((C5T) list2.get(i3)).A01 = 8;
                        ((C5T) list2.get(i3)).A02 = false;
                        try {
                            RandomAccessFile randomAccessFile = cq4.A06;
                            randomAccessFile.seek((((long) i3) * 9) + 56);
                            randomAccessFile.writeInt(8);
                            randomAccessFile.skipBytes(4);
                            randomAccessFile.writeBoolean(false);
                            break;
                        } catch (IOException e) {
                            C108995ce.A1M("queuefile/dropsentdata ", AnonymousClass000.A10(), e);
                        }
                    }
                }
            }
        }
        int i4 = 0;
        do {
            boolean[] zArr = cbS.A06;
            if (zArr[i4]) {
                Map map = cbS.A05;
                Iterator A152 = AnonymousClass000.A15(map);
                while (true) {
                    if (!A152.hasNext()) {
                        break;
                    }
                    Map.Entry A16 = AnonymousClass000.A16(A152);
                    C25989Cq4 cq42 = (C25989Cq4) A16.getValue();
                    Object key = A16.getKey();
                    if (cq42.A04 == i4) {
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i = cq42.A01;
                            if (i5 >= i) {
                                break;
                            }
                            if (((C5T) cq42.A07.get(i5)).A01 <= 8) {
                                i6++;
                            }
                            i5++;
                        }
                        if (i6 == i) {
                            try {
                                cq42.A06.close();
                            } catch (IOException e2) {
                                C108995ce.A1M("queuefile/flush failed to close file ", AnonymousClass000.A10(), e2);
                            }
                            zArr[i4] = false;
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append(cbS.A01);
                            try {
                                C108945cZ.A17(AnonymousClass001.A1I("wampsid", A10, i4)).delete();
                            } catch (Exception e3) {
                                C17900vP.A0X(e3, "psuploadqueue/dropSentData failed to delete closed queue file ", AnonymousClass000.A10());
                            }
                            map.remove(key);
                        }
                    }
                }
            }
            i4++;
        } while (i4 < 8);
        C17880vN.A1F(C19830z4.A00(cbS.A03), "events_ps_phase3_migration_done", true);
        C25273CcL A012 = A01(1);
        if (this.A00) {
            ByteBuffer asReadOnlyBuffer = A012.A04.A02.asReadOnlyBuffer();
            asReadOnlyBuffer.flip();
            if (asReadOnlyBuffer.limit() > 0) {
                A07(asReadOnlyBuffer, false);
            }
            this.A00 = false;
        }
        try {
            A012.A01();
            A012.A02();
        } catch (IOException e4) {
            Log.e(BEA.A0j(e4, "privatestatseventbuffermanager/dropsentdata: ioexception while flushing back buffer", AnonymousClass000.A10()));
        }
    }

    public void A02() {
        super.A02();
        this.A01.A00(this.A02);
    }

    public void A03() {
        super.A03();
        this.A01.A00(this.A02);
    }

    public void A07(ByteBuffer byteBuffer, boolean z) {
        StringBuilder sb;
        String str;
        int i;
        boolean A022;
        int limit = byteBuffer.limit();
        C25231CbS cbS = this.A01;
        cbS.A02 = new byte[10240];
        cbS.A00 = 0;
        byteBuffer.position(0);
        byteBuffer.position(8);
        byte[] bArr = new byte[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
        try {
            int position = byteBuffer.position();
            String str2 = null;
            boolean z2 = false;
            int i2 = 0;
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                if (position < limit) {
                    CQX A03 = C26239Cvc.A03(byteBuffer);
                    int i4 = A03.A01;
                    if (i4 == 0) {
                        if (A03.A00 == 6005) {
                            str2 = (String) A03.A02;
                            int position2 = byteBuffer.position() - position;
                            byteBuffer.position(position);
                            byteBuffer.get(bArr, 0, position2);
                            z2 = cbS.A02(bArr, position2, str2);
                        } else {
                            int position3 = byteBuffer.position() - position;
                            byteBuffer.position(position);
                            byteBuffer.get(bArr, 0, position3);
                            Iterator A15 = AnonymousClass000.A15(cbS.A05);
                            while (A15.hasNext()) {
                                ((C25989Cq4) C17890vO.A0P(A15)).A01(bArr, position3);
                            }
                            if (position3 > 2048) {
                                position3 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                            }
                            int i5 = cbS.A00;
                            if (position3 > 10240 - i5) {
                                Log.e("privatestatsuploadqueue/writetoCommonAttrBuffer too many common attributes");
                                z2 = false;
                            } else {
                                System.arraycopy(bArr, 0, cbS.A02, i5, position3);
                                cbS.A00 += position3;
                                z2 = true;
                            }
                        }
                        i2 = position;
                    } else {
                        if (i4 == 1) {
                            i = byteBuffer.position();
                            if ((byteBuffer.get(position) & 4) != 0) {
                                int i6 = i - position;
                                byteBuffer.position(position);
                                byteBuffer.get(bArr, 0, i6);
                                A022 = cbS.A02(bArr, i6, str2);
                            } else {
                                i3 = position;
                                z3 = true;
                            }
                        } else if (i4 == 2 && (byteBuffer.get(position) & 4) != 0 && z3) {
                            i = byteBuffer.position();
                            int i7 = i - i3;
                            byteBuffer.position(i3);
                            if (i7 <= 2048) {
                                byteBuffer.get(bArr, 0, i7);
                                A022 = cbS.A02(bArr, i7, str2);
                            } else {
                                byte[] bArr2 = new byte[i7];
                                byteBuffer.get(bArr2, 0, i7);
                                A022 = cbS.A02(bArr2, i7, str2);
                            }
                        }
                        byteBuffer.position(i);
                        i2 = i3;
                        z3 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    position = byteBuffer.position();
                } else if (z2) {
                    cbS.A02 = null;
                    cbS.A00 = 0;
                    return;
                }
            }
            if (!z) {
                cbS.A02 = null;
                cbS.A00 = 0;
            } else {
                C25273CcL A012 = A01(1);
                try {
                    int i8 = cbS.A00;
                    if (i8 > 0) {
                        A012.A04(cbS.A02, i8);
                        cbS.A02 = null;
                        cbS.A00 = 0;
                    }
                    int limit2 = byteBuffer.limit() - i2;
                    byteBuffer.position(i2);
                    if (limit2 <= 2048) {
                        byteBuffer.get(bArr, 0, limit2);
                        A012.A04(bArr, limit2);
                    } else {
                        byte[] bArr3 = new byte[limit2];
                        byteBuffer.get(bArr3, 0, limit2);
                        A012.A04(bArr3, limit2);
                    }
                    try {
                        A012.A02();
                        this.A00 = true;
                        return;
                    } catch (IOException e) {
                        Log.e(BEA.A0j(e, "privatestatseventbuffermanager/splitBuffer: ioexception while flushing back buffer", AnonymousClass000.A10()));
                        return;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    Log.e(BEA.A0j(e2, "privatestatseventbuffermanager/splitBuffer: unexpected runtime exception when writing to back buffer ", AnonymousClass000.A10()));
                    try {
                        A012.A01();
                        A012.A02();
                    } catch (Exception e3) {
                        Log.e(BEA.A0j(e3, "privatestatseventbuffermanager/splitBuffer see exception when clearing the back buffer ", AnonymousClass000.A10()));
                    }
                }
            }
            this.A00 = false;
        } catch (C24388C1i e4) {
            e = e4;
            sb = AnonymousClass000.A10();
            str = "privatestatseventbuffermanager/splitbuffer invalid buf content";
            Log.e(BEA.A0j(e, str, sb));
        } catch (Throwable th) {
            e = th;
            sb = AnonymousClass000.A10();
            str = "privateStatseventbuffermanager/splitbuffer unexpected errors ";
            Log.e(BEA.A0j(e, str, sb));
        }
    }
}
