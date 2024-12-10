package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Bwn  reason: case insensitive filesystem */
public final class C24177Bwn extends FilterInputStream {
    public int A00;
    public boolean A01;

    public int available() {
        return 0;
    }

    public synchronized void mark(int i) {
        throw C17880vN.A0y();
    }

    public boolean markSupported() {
        return false;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = read();
            if (read != -1) {
                i3 = BE6.A0A(read, bArr, i + i3, i3);
            } else if (i3 <= 0) {
                return -1;
            } else {
                return i3;
            }
        }
        return i2;
    }

    public synchronized void reset() {
        throw C17880vN.A0y();
    }

    public long skip(long j) {
        for (long j2 = 0; j2 < j; j2++) {
            if (read() == -1) {
                return j2;
            }
        }
        return j;
    }

    public C24177Bwn(InputStream inputStream) {
        super(inputStream);
        if (inputStream == null) {
            throw AnonymousClass000.A0s("in may not be null");
        }
    }

    public int read() {
        ByteBuffer allocate = ByteBuffer.allocate(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        byte[] array = allocate.array();
        while (true) {
            int read = super.read();
            if (read == -1) {
                break;
            }
            if (this.A01) {
                int i = this.A00;
                if (i > 0) {
                    this.A00 = i - 1;
                    return read;
                } else if (allocate.remaining() != 0) {
                    allocate.put((byte) read);
                    if (allocate.position() >= 2 && array[allocate.position() - 1] == 10 && array[allocate.position() - 2] == 13) {
                        if (allocate.position() > 2) {
                            String str = new String(array, 0, allocate.position() - 2, C19620yd.A0A);
                            try {
                                int parseInt = Integer.parseInt(str, 16);
                                this.A00 = parseInt;
                                if (parseInt == 0) {
                                    if (super.read() == -1) {
                                        throw C17880vN.A0f("stream ended early during parse final chunk");
                                    } else if (super.read() == -1) {
                                        throw C17880vN.A0f("stream ended early during parse final chunk");
                                    }
                                }
                            } catch (NumberFormatException unused) {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("chunk length ");
                                A10.append(str);
                                throw BE9.A0e(" failed to parse", A10);
                            }
                        }
                    }
                } else {
                    throw C17880vN.A0f("corrupt pseudo http input [max chunk header length exceeded]");
                }
            } else if (allocate.remaining() != 0) {
                allocate.put((byte) read);
                if (allocate.position() >= 2 && array[allocate.position() - 1] == 10 && array[allocate.position() - 2] == 13) {
                    if (allocate.position() == 2) {
                        this.A01 = true;
                    } else {
                        String[] split = new String(array, 0, allocate.position() - 2, C19620yd.A0A).split(":", 2);
                        if (split.length == 2) {
                            String trim = split[0].trim();
                            String trim2 = split[1].trim();
                            if (trim.equalsIgnoreCase("Transfer-Encoding") && !trim2.equalsIgnoreCase("chunked")) {
                                throw C17880vN.A0f(AnonymousClass001.A1H("Unexpect transfer encoding encountered: ", trim2, AnonymousClass000.A10()));
                            }
                        }
                    }
                }
            } else {
                throw C17880vN.A0f("corrupt pseudo http input [max http header length exceeded]");
            }
            allocate.clear();
        }
        return -1;
    }
}
