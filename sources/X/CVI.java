package X;

import com.facebook.wearable.datax.Connection;
import java.nio.ByteBuffer;

public final class CVI {
    public final /* synthetic */ Connection A00;

    public CVI(Connection connection) {
        this.A00 = connection;
    }

    public final ByteBuffer A00() {
        Connection connection = this.A00;
        C24585CAg cAg = Connection.Companion;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(connection.pollReceiveFragmentNative(connection.f3native.A00(), (ByteBuffer) null, 0));
        C18070vi.A0b(allocateDirect);
        C18070vi.A0d(allocateDirect, 0);
        if (allocateDirect.remaining() >= connection.pollReceiveFragmentNative(connection.f3native.A00(), (ByteBuffer) null, 0)) {
            BE8.A1G(allocateDirect, connection.pollReceiveFragmentNative(connection.f3native.A00(), allocateDirect, allocateDirect.position()));
            allocateDirect.flip();
            return allocateDirect;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Buffer remaining space is to small ");
        A10.append(allocateDirect.remaining());
        A10.append(" < ");
        A10.append(connection.pollReceiveFragmentNative(connection.f3native.A00(), (ByteBuffer) null, 0));
        throw AnonymousClass000.A0m(A10);
    }
}
