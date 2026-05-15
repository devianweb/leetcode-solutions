def meteor_shower(solar_system):    
    system = []
    
    while len(solar_system) > 0:
        body = solar_system.pop(0)
        
        #right meteor, go hit things or fly away
        if body.endswith('>'):
            #hits top of solar system
            if (len(solar_system) != 0):
                idx = 0
                while idx < len(solar_system):
                    top = solar_system[idx]
                    #is it a planet with protection? if so, remove 1 layer
                    if top.startswith('('):
                        solar_system[idx] = top[1:-1]
                        break
                    #is it a meteor? if not, bye bye planet
                    elif not top.startswith('<') and not top.endswith('>'):
                        solar_system.pop(idx)
                        break
                    else:
                        idx = idx + 1
                    
        #left meteor, go hit things or fly away                
        elif body.startswith('<'):
            #hits top of system, this doesn't need complex meteor skipping logic as this stack will only ever contain planets
            if len(system) != 0:
                top = system[-1]
                if top.startswith('('):
                    system[-1] = top[1:-1]
                else:
                    system.pop()
        
        #this is a planet, dump it in the system stack
        else:
            system.append(body)
                
    return system

#         print('solar_system: ')
#         print(solar_system)
#         print('---')

        
#         print('body: ')
#         print(body)
#         print('---')
        
#         print('system: ')
#         print(system)
#         print('------ ------ ------')
