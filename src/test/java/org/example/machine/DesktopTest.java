package org.example.machine;

import org.example.interfaces.AuthorisingService;
import org.example.interfaces.VirtualMachineRequestor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DesktopTest {

    VirtualMachineRequestor mockedRequestor;
    AuthorisingService mockedService;

    void setUp(){
        mockedService = mock(AuthorisingService.class);
        mockedRequestor = mock(VirtualMachineRequestor.class);
    }

    @Test
    void TestIfUserIsAuthorized() {
        when(mockedService.isAuthorised(anyString())).thenReturn(false);
        
    }

    @Test
    void shouldThrowExceptionIfMachineIsNull() {



    }

}