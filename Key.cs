using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp13
{
    public class Key
    {
        public byte index;
        public byte packetIndex;

        public Key()
        {

        }

        public Key(byte index, byte packetIndex)
        {
            this.index = index;
            this.packetIndex = packetIndex; 
        }

        public static readonly Key Esc = new Key(4, 1);
        public static readonly Key BackQuote = new Key(5, 1); 
        public static readonly Key Tab = new Key(6, 1);
        public static readonly Key CapsLock = new Key(7, 1);
        public static readonly Key LeftShift = new Key(8, 1); 
        public static readonly Key LeftCtrl = new Key(9, 1); 
        public static readonly Key F12 = new Key(10, 1);
        public static readonly Key Equal = new Key(11, 1);
        public static readonly Key Num7 = new Key(13, 1); 
        public static readonly Key F1 = new Key(16, 1);
        public static readonly Key Key1 = new Key(17, 1); 
        public static readonly Key Q = new Key(18, 1);
        public static readonly Key A = new Key(19, 1);
        public static readonly Key BackslashLeft = new Key(20, 1);
        public static readonly Key WinLeft = new Key(21, 1);
        public static readonly Key Print = new Key(22, 1);
        public static readonly Key MediaMute = new Key(24, 1); 
        public static readonly Key Num8 = new Key(25, 1);
        public static readonly Key F2 = new Key(28, 1);
        public static readonly Key Key2 = new Key(29, 1);
        public static readonly Key W = new Key(30, 1); 
        public static readonly Key S = new Key(31, 1); 
        public static readonly Key Z = new Key(32, 1);
        public static readonly Key AltLeft = new Key(33, 1); 
        public static readonly Key ScrollLock = new Key(34, 1);
        public static readonly Key Backspace = new Key(35, 1); 
        public static readonly Key MeidaPause = new Key(36, 1);
        public static readonly Key Num9 = new Key(37, 1);
        public static readonly Key F3 = new Key(40, 1);
        public static readonly Key Key3 = new Key(41, 1);
        public static readonly Key E = new Key(42, 1); 
        public static readonly Key D = new Key(43, 1);
        public static readonly Key X = new Key(44, 1);
        public static readonly Key Break = new Key(46, 1); 
        public static readonly Key Delete = new Key(47, 1);
        public static readonly Key MediaPrev = new Key(48, 1);
        public static readonly Key F4 = new Key(52, 1); 
        public static readonly Key Key4 = new Key(53, 1); 
        public static readonly Key R = new Key(54, 1);
        public static readonly Key F = new Key(55, 1);
        public static readonly Key C = new Key(56, 1);
        public static readonly Key Space = new Key(57, 1);
        public static readonly Key Insert = new Key(58, 1);
        public static readonly Key End = new Key(59, 1);
        public static readonly Key MediaStop = new Key(60, 1);
        public static readonly Key Num4 = new Key(61, 1);
        public static readonly Key F5 = new Key(4, 2);
        public static readonly Key Key5 = new Key(5, 2);
        public static readonly Key T = new Key(6, 2);
        public static readonly Key G = new Key(7, 2); 
        public static readonly Key V = new Key(8, 2); 
        public static readonly Key Home = new Key(10, 2);
        public static readonly Key PageDown = new Key(11, 2); 
        public static readonly Key MediaNext = new Key(12, 2);
        public static readonly Key Num5 = new Key(13, 2);
        public static readonly Key F6 = new Key(16, 2); 
        public static readonly Key key6 = new Key(17, 2); 
        public static readonly Key Y = new Key(18, 2); 
        public static readonly Key H = new Key(19, 2); 
        public static readonly Key B = new Key(20, 2); 
        public static readonly Key PageUp = new Key(22, 2);
        public static readonly Key ShiftRight = new Key(23, 2);
        public static readonly Key NumLock = new Key(24, 2);
        public static readonly Key Num6 = new Key(25, 2);
        public static readonly Key F7 = new Key(28, 2); 
        public static readonly Key Key7 = new Key(29, 2);
        public static readonly Key U = new Key(30, 2);
        public static readonly Key J = new Key(31, 2);
        public static readonly Key N = new Key(32, 2);
        public static readonly Key AltRight = new Key(33, 2);
        public static readonly Key RightBracket = new Key(34, 2);
        public static readonly Key CtrlRight = new Key(35, 2);
        public static readonly Key NumDivide = new Key(36, 2);
        public static readonly Key Num1 = new Key(37, 2); 
        public static readonly Key F8 = new Key(40, 2); 
        public static readonly Key Key8 = new Key(41, 2);
        public static readonly Key I = new Key(42, 2);
        public static readonly Key K = new Key(43, 2);
        public static readonly Key M = new Key(44, 2); 
        public static readonly Key WinRight = new Key(45, 2);
        public static readonly Key ArrowUp = new Key(47, 2);
        public static readonly Key NumMultiply = new Key(48, 2);
        public static readonly Key Num2 = new Key(49, 2); 
        public static readonly Key F9 = new Key(52, 2);
        public static readonly Key Key9 = new Key(53, 2);
        public static readonly Key O = new Key(54, 2);
        public static readonly Key L = new Key(55, 2);
        public static readonly Key Comma = new Key(56, 2);
        public static readonly Key Backslash = new Key(58, 2);
        public static readonly Key ArrowLeft = new Key(59, 2);
        public static readonly Key NumMinus = new Key(60, 2);
        public static readonly Key Num3 = new Key(61, 2);
        public static readonly Key F10 = new Key(4, 3);
        public static readonly Key Key0 = new Key(5, 3);
        public static readonly Key P = new Key(6, 3);
        public static readonly Key Semicolon = new Key(7, 3);
        public static readonly Key Period = new Key(8, 3);
        public static readonly Key Enter = new Key(10, 3);
        public static readonly Key ArrowDown = new Key(11, 3);
        public static readonly Key NumPlus = new Key(12, 3);
        public static readonly Key Num0 = new Key(13, 3);
        public static readonly Key F11 = new Key(16, 3);
        public static readonly Key KeyMinus = new Key(17, 3);
        public static readonly Key LeftBracket = new Key(18, 3);
        public static readonly Key Quote = new Key(19, 3);
        public static readonly Key Slash = new Key(20, 3);
        public static readonly Key Brightness = new Key(21, 3);
        public static readonly Key ArrowRight = new Key(23, 3);
        public static readonly Key NumEnter = new Key(24, 3);
        public static readonly Key NumComma = new Key(25, 3);

    }
}
