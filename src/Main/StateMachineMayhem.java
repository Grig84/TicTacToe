package Main;

import java.util.ArrayList;

public class StateMachineMayhem {
    static ArrayList<ButtonTickTackToe> m_buttonList;
    static ButtonTickTackToe button;

    public StateMachineMayhem(ArrayList<ButtonTickTackToe> buttonList) {
        this.m_buttonList = buttonList;

    }

    public enum StateMachine {
        
        empty {
            @Override
            public StateMachine nextState() {
                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return X;
                        } else if (buttonNumber == 1) {
                            return _X;
                        } else if (buttonNumber == 2) {
                            return __X;
                        } else if (buttonNumber == 3) {
                            return ___X;
                        } else if (buttonNumber == 4) {
                            return ____X;
                        } else if (buttonNumber == 5) {
                            return _____X;
                        } else if (buttonNumber == 6) {
                            return ______X;
                        } else if (buttonNumber == 7) {
                            return _______X;
                        } else if (buttonNumber == 8) {
                            return ________X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return O;
                        } else if (buttonNumber == 1) {
                            return _O;
                        } else if (buttonNumber == 2) {
                            return __O;
                        } else if (buttonNumber == 3) {
                            return ___O;
                        } else if (buttonNumber == 4) {
                            return ____O;
                        } else if (buttonNumber == 5) {
                            return _____O;
                        } else if (buttonNumber == 6) {
                            return ______O;
                        } else if (buttonNumber == 7) {
                            return _______O;
                        } else if (buttonNumber == 8) {
                            return ________O;
                        }
                    }
                }

                return empty;
            }
        },

        O {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OX;
                        } else if (buttonNumber == 1) {
                            return O_X;
                        } else if (buttonNumber == 2) {
                            return O__X;
                        } else if (buttonNumber == 3) {
                            return O___X;
                        } else if (buttonNumber == 4) {
                            return O____X;
                        } else if (buttonNumber == 5) {
                            return O_____X;
                        } else if (buttonNumber == 6) {
                            return O______X;
                        } else if (buttonNumber == 7) {
                            return O_______X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OO;
                        } else if (buttonNumber == 1) {
                            return O_O;
                        } else if (buttonNumber == 2) {
                            return O__O;
                        } else if (buttonNumber == 3) {
                            return O___O;
                        } else if (buttonNumber == 4) {
                            return O____O;
                        } else if (buttonNumber == 5) {
                            return O_____O;
                        } else if (buttonNumber == 6) {
                            return O______O;
                        } else if (buttonNumber == 7) {
                            return O_______O;
                        }
                    }
                }
                return O;
            }
        },
        
        OX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXX;
                        } else if (buttonNumber == 1) {
                            return OX_X;
                        } else if (buttonNumber == 2) {
                            return OX__X;
                        } else if (buttonNumber == 3) {
                            return OX___X;
                        } else if (buttonNumber == 4) {
                            return OX____X;
                        } else if (buttonNumber == 5) {
                            return OX_____X;
                        } else if (buttonNumber == 6) {
                            return OX______X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXO;
                        } else if (buttonNumber == 1) {
                            return OX_O;
                        } else if (buttonNumber == 2) {
                            return OX__O;
                        } else if (buttonNumber == 3) {
                            return OX___O;
                        } else if (buttonNumber == 4) {
                            return OX____O;
                        } else if (buttonNumber == 5) {
                            return OX_____O;
                        } else if (buttonNumber == 6) {
                            return OX______O;
                        }
                    }
                }

                return OX;
            }
        },
        
        OXX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXX;
                        } else if (buttonNumber == 1) {
                            return OXX_X;
                        } else if (buttonNumber == 2) {
                            return OXX__X;
                        } else if (buttonNumber == 3) {
                            return OXX___X;
                        } else if (buttonNumber == 4) {
                            return OXX____X;
                        } else if (buttonNumber == 5) {
                            return OXX_____X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXO;
                        } else if (buttonNumber == 1) {
                            return OXX_O;
                        } else if (buttonNumber == 2) {
                            return OXX__O;
                        } else if (buttonNumber == 3) {
                            return OXX___O;
                        } else if (buttonNumber == 4) {
                            return OXX____O;
                        } else if (buttonNumber == 5) {
                            return OXX_____O;
                        }
                    }
                }

                return OXX;
            }
        },
        
        OXXX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXX;
                        } else if (buttonNumber == 1) {
                            return OXXX_X;
                        } else if (buttonNumber == 2) {
                            return OXXX__X;
                        } else if (buttonNumber == 3) {
                            return OXXX___X;
                        } else if (buttonNumber == 4) {
                            return OXXX____X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXO;
                        } else if (buttonNumber == 1) {
                            return OXXX_O;
                        } else if (buttonNumber == 2) {
                            return OXXX__O;
                        } else if (buttonNumber == 3) {
                            return OXXX___O;
                        } else if (buttonNumber == 4) {
                            return OXXX____O;
                        }
                    }
                }

                return OXXX;
            }
        },
        
        OXXXX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXX;
                        } else if (buttonNumber == 1) {
                            return OXXXX_X;
                        } else if (buttonNumber == 2) {
                            return OXXXX__X;
                        } else if (buttonNumber == 3) {
                            return OXXXX___X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXO;
                        } else if (buttonNumber == 1) {
                            return OXXXX_O;
                        } else if (buttonNumber == 2) {
                            return OXXXX__O;
                        } else if (buttonNumber == 3) {
                            return OXXXX___O;
                        }
                    }
                }

                return OXXXX;
            }
        },
        
        OXXXXX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXX;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_X;
                        } else if (buttonNumber == 2) {
                            return OXXXXX__X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXO;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_O;
                        } else if (buttonNumber == 2) {
                            return OXXXXX__O;
                        }
                    }
                }

                return OXXXXX;
            }
        },
        
        OXXXX_X {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXX;
                        } else if (buttonNumber == 1) {
                            return OXXXX_XX;
                        } else if (buttonNumber == 2) {
                            return OXXXXX_X_X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXOX;
                        } else if (buttonNumber == 1) {
                            return OXXXX_XO;
                        } else if (buttonNumber == 2) {
                            return OXXXXX_X_O;
                        }
                    }
                }

                return OXXXX_X;
            }
        },
        
        OXXXX_XX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXX;
                        } else if (buttonNumber == 1) {
                            return OXXXX_XXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXOXX;
                        } else if (buttonNumber == 1) {
                            return OXXXX_XXO;
                        }
                    }
                }

                return OXXXX_XX;
            }
        },
        
        OXXXXX_X_O {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXX_O;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XXO;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXOX_O;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XOO;
                        }
                    }
                }

                return OXXXX_XX;
            }
        }
        
        
        ,
        
        OXXXXX_X_X {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXX_X;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXOX_X;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XOX;
                        }
                    }
                }

                return OXXXXX_X_X;
            }
        },
        
        OXXXXOX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXOXX;
                        } else if (buttonNumber == 1) {
                            return OXXXXOX_X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXOXO;
                        } else if (buttonNumber == 1) {
                            return OXXXXOX_O;
                        }
                    }
                }

                return OXXXXOX;
            }
        }
        
        
        ,
        
        OXXXXX_O {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXX;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXOX;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XO;
                        }
                    }
                }

                return OXXXXX_O;
            }
        },
        
        OXXXXX__X {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXX_X;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXO_X;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_OX;
                        }
                    }
                }

                return OXXXXX__X;
            }
        }
        
        
        ,
        
        OXXXXX_X {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXX;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXOX;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XO;
                        }
                    }
                }

                return OXXXXX_X;
            }
        },
        
        OXXXXX__O {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXX_X;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_XX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXO_X;
                        } else if (buttonNumber == 1) {
                            return OXXXXX_OX;
                        }
                    }
                }

                return OXXXXX__O;
            }
        }
        
        
        ,
        
        OXXXX_XO {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXO;
                        } else if (buttonNumber == 1) {
                            return OXXXX_XOX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXOXO;
                        } else if (buttonNumber == 1) {
                            return OXXXX_XOO;
                        }
                    }
                }

                return OXXXX_XO;
            }
        },
        
        OXXXXX_XX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXOXX;
                        }
                    }
                }

                return OXXXXX_XX;
            }
        },
        
        OXXXXX_XO {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXO;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXOXO;
                        }
                    }
                }

                return OXXXXX_XO;
            }
        },
        
        OXXXXXX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXX;
                        } else if (buttonNumber == 1) {
                            return OXXXXXX_X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXO;
                        } else if (buttonNumber == 1) {
                            return OXXXXXX_O;
                        }
                    }
                }

                return OXXXXXX;
            }
        },
        
        OXXXXXX_X {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXOX;
                        }
                    }
                }

                return OXXXXXX_X;
            }
        },
        
        OXXXXXX_O {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXO;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXOO;
                        }
                    }
                }

                return OXXXXXX_O;
            }
        },
        
        OXXXXXXX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXO;
                        }
                    }
                }

                return OXXXXXXX;
            }
        },
        
        OXXXXXXXX {
            @Override
            public StateMachine nextState() {
                return OXXXXXXXX;
            }
        },

        OXXXXXXXO {
            @Override
            public StateMachine nextState() {
                return OXXXXXXXO;
            }
        },
        
        OXXXXXXO {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXO;
                        }
                    }
                }

                return OXXXXXXO;
            }
        },
        
        OXXXXXXOX {
            @Override
            public StateMachine nextState() {
                return OXXXXXXOX;
            }
        },

        OXXXXXXOO {
            @Override
            public StateMachine nextState() {
                return OXXXXXXOO;
            }
        },
        
        OXXXXXO {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXOX;
                        } else if (buttonNumber == 1) {
                            return OXXXXXO_X;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXOO;
                        } else if (buttonNumber == 1) {
                            return OXXXXXO_O;
                        }
                    }
                }

                return OXXXXXO;
            }
        },
        
        OXXXXXO_X {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXOX;
                        }
                    }
                }

                return OXXXXXO_X;
            }
        },
        
        OXXXXX_OX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXOX;
                        }
                    }
                }

                return OXXXXX_OX;
            }
        },
        
        OXXXXXO_O {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXO;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXOO;
                        }
                    }
                }

                return OXXXXXO_O;
            }
        },
        
        OXXXXXOX {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXOXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXOXO;
                        }
                    }
                }

                return OXXXXXOX;
            }
        },
        
        OXXXXXOXX {
            @Override
            public StateMachine nextState() {
                return OXXXXXOXX;
            }
        },

        OXXXXXOXO {
            @Override
            public StateMachine nextState() {
                return OXXXXXOXO;
            }
        },
        
        OXXXXXOO {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXX;
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return OXXXXXXXO;
                        }
                    }
                }

                return OXXXXXOO;
            }
        },
        
        OXXXXXOOX {
            @Override
            public StateMachine nextState() {
                return OXXXXXOOX;
            }
        },

        OXXXXXOOO {
            @Override
            public StateMachine nextState() {
                return OXXXXXOOO;
            }
        },
        
        X {
            @Override
            public StateMachine nextState() {
                m_buttonList.remove(button);

                for (int buttonNumber = 0; buttonNumber <m_buttonList.size(); buttonNumber ++) {
                    button = m_buttonList.get(buttonNumber);
                    if (button.getTeam() == 1) {
                        if (buttonNumber == 0) {
                            return XX;
                        } else if (buttonNumber == 1) {
                            return X_X;
                        } else if (buttonNumber == 2) {
                            return X__X;
                        } else if (buttonNumber == 3) {
                            return X___X;
                        } else if (buttonNumber == 4) {
                            return X____X;
                        } else if (buttonNumber == 5) {
                            return X_____X; 
                        } else if (buttonNumber == 6) {
                            return X______X; 
                        } else if (buttonNumber == 7) {
                            return X_______X; 
                        }
                    } else if (button.getTeam() == 2) {
                        if (buttonNumber == 0) {
                            return XO;
                        } else if (buttonNumber == 1) {
                            return X_O;
                        } else if (buttonNumber == 2) {
                            return X__O;
                        } else if (buttonNumber == 3) {
                            return X___O;
                        } else if (buttonNumber == 4) {
                            return X____O;
                        } else if (buttonNumber == 5) {
                            return X_____O;
                        } else if (buttonNumber == 6) {
                            return X______O;
                        } else if (buttonNumber == 7) {
                            return X_______O;
                        }
                    }
                }
            }
        };

        public abstract StateMachine nextState();
    }
}
